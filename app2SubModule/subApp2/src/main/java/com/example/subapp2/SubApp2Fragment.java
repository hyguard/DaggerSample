package com.example.subapp2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.subapp2.databinding.SubApp2FragmentBinding;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.support.DaggerFragment;

public class SubApp2Fragment extends DaggerFragment {

    @Inject
    @Named("name_1")
    String str1;

    @Inject
    @Named("name_2")
    String str2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        SubApp2FragmentBinding binding = SubApp2FragmentBinding.inflate(getLayoutInflater());
        binding.text1.setText(str1);
        binding.text2.setText(str2);
        return binding.getRoot();
    }
}
