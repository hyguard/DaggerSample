package com.example.subapp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.subapp1.databinding.SubApp1FragmentBinding;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

public class SubApp1Fragment extends DaggerFragment {

    private static final int REQUEST_CODE = 1000;

    @Inject
    ICommonResource commonResource;

    @Inject
    ISubApp1Router subApp1Router;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        SubApp1FragmentBinding binding = SubApp1FragmentBinding.inflate(getLayoutInflater());
        binding.commonResource1Tv.setText(commonResource.getCommonResource1());
        binding.commonResource2Tv.setText(commonResource.getCommonResource2());
        binding.button.setOnClickListener(v -> subApp1Router.goMainSub(getContext()));
        binding.button2.setOnClickListener(v -> subApp1Router.goMainSub(getActivity(), REQUEST_CODE));
        return binding.getRoot();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                Toast.makeText(getContext(), "result ok", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getContext(), "result not ok", Toast.LENGTH_SHORT).show();
            }
            return;
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}
