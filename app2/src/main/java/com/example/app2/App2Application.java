package com.example.app2;


import com.example.app2.dagger.DaggerApp2Component;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class App2Application extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerApp2Component.builder()
                .application(this)
                .build();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // ...
    }
}
