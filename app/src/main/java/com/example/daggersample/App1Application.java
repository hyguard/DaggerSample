package com.example.daggersample;


import com.example.daggersample.dagger.DaggerApp1Component;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class App1Application extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerApp1Component.builder()
                .application(this)
                .build();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // ...
    }
}
