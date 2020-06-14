package com.example.daggersample.dagger.implementation;

import android.app.Application;

import com.example.subapp1.ICommonResource;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonResourceModule {
    @Singleton
    @Provides
    public ICommonResource commonResource(Application application) {
        return new CommonResourceProvider(application);
    }
}
