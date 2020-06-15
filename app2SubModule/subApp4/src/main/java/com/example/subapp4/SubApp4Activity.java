package com.example.subapp4;

import android.os.Bundle;
import android.util.Log;

import com.example.subapp4.databinding.ActivitySubApp4Binding;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.Lazy;
import dagger.android.support.DaggerAppCompatActivity;

public class SubApp4Activity extends DaggerAppCompatActivity {

    @Inject
    Integer directInjectionValue;

    @Inject
    Lazy<Integer> lazyInjectionValue;

    @Inject
    Provider<Integer> providerInjectionValue;

    private ActivitySubApp4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySubApp4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initTv1();
        initTv2();
        initTv3();
    }

    private void initTv1() {
        StringBuilder sb = new StringBuilder();
        Log.d("injections", "initTv1 - direct injection start");
        int value = directInjectionValue;
        sb.append(value);
        Log.d("injections", "initTv1 - direct provider value : " + value);
        value = directInjectionValue;
        sb.append("\n" + value);
        Log.d("injections", "initTv1 - direct provider value : " + value);
        value = directInjectionValue;
        sb.append("\n" + value);
        Log.d("injections", "initTv1 - direct provider value : " + value);
        binding.numTv1.setText(sb.toString());
    }

    private void initTv2() {
        StringBuilder sb = new StringBuilder();
        Log.d("injections", "initTv2 - lazy injection start");
        int value = lazyInjectionValue.get();
        sb.append(value);
        Log.d("injections", "initTv2 - lazy injection value : " + value);
        value = lazyInjectionValue.get();
        sb.append("\n" + value);
        Log.d("injections", "initTv2 - lazy injection value : " + value);
        value = lazyInjectionValue.get();
        sb.append("\n" + value);
        Log.d("injections", "initTv2 - lazy injection value : " + value);
        binding.numTv2.setText(sb.toString());
    }

    private void initTv3() {
        StringBuilder sb = new StringBuilder();
        Log.d("injections", "initTv3 - provider injection start");
        int value = providerInjectionValue.get();
        sb.append(value);
        Log.d("injections", "initTv3 - provider value : " + value);
        value = providerInjectionValue.get();
        sb.append("\n" + value);
        Log.d("injections", "initTv3 - provider value : " + value);
        value = providerInjectionValue.get();
        sb.append("\n" + value);
        Log.d("injections", "initTv3 - provider value : " + value);
        binding.numTv3.setText(sb.toString());
    }
}
