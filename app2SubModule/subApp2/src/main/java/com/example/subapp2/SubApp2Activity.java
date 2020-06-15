package com.example.subapp2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.subapp2.databinding.ActivitySubApp2Binding;

import dagger.android.support.DaggerAppCompatActivity;

public class SubApp2Activity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySubApp2Binding binding = ActivitySubApp2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Fragment fragment = getSupportFragmentManager().findFragmentById(binding.content.getId());
        if (fragment instanceof SubApp2Fragment) {
            fragmentTransaction.replace(binding.content.getId(), fragment);
        } else {
            fragmentTransaction.add(binding.content.getId(), generateFragment());
        }
        fragmentTransaction.commit();
    }

    private Fragment generateFragment() {
        SubApp2Fragment subApp2Fragment = new SubApp2Fragment();
        return subApp2Fragment;
    }
}
