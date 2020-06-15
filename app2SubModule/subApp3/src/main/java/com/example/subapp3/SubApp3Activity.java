package com.example.subapp3;

import android.os.Bundle;

import com.example.subapp3.databinding.ActivitySubApp3Binding;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.support.DaggerAppCompatActivity;

public class SubApp3Activity extends DaggerAppCompatActivity {

    @Inject
    int injectedNum;

    @Inject
    @Named("name_1")
    String injectNamedStr;

    @Inject
    String injectedStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySubApp3Binding binding = ActivitySubApp3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.numTv.setText("injectedNum : " + injectedNum + "\ninjectNamedStr : " + injectNamedStr + "\ninjectedStr : " + injectedStr);
    }
}
