package com.example.subapp1;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.subapp1.databinding.ActivitySubApp1Binding;

import dagger.android.support.DaggerAppCompatActivity;

public class SubApp1Activity extends DaggerAppCompatActivity {

    private SubApp1Fragment subApp1Fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySubApp1Binding binding = ActivitySubApp1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Fragment fragment = getSupportFragmentManager().findFragmentById(binding.content.getId());
        if (fragment instanceof SubApp1Fragment) {
            this.subApp1Fragment = (SubApp1Fragment) fragment;
            fragmentTransaction.replace(binding.content.getId(), fragment);
        } else {
            fragmentTransaction.add(binding.content.getId(), generateFragment());
        }
        fragmentTransaction.commit();
    }

    private Fragment generateFragment() {
        SubApp1Fragment subApp1Fragment = new SubApp1Fragment();
        this.subApp1Fragment = subApp1Fragment;
        return subApp1Fragment;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (subApp1Fragment != null) {
            subApp1Fragment.onActivityResult(requestCode, resultCode, data);
        }
    }
}
