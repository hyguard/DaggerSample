package com.example.daggersample.dagger.router;

import com.example.subapp1.ISubApp1Router;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RouterModule {
    @Singleton
    @Provides
    public ISubApp1Router subApp1Router() {
        return new SubApp1Router();
    }
}
