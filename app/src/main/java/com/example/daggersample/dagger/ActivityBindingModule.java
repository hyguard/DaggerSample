package com.example.daggersample.dagger;

import com.example.subapp1.SubApp1Activity;
import com.example.subapp1.SubApp1Module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {
    @ContributesAndroidInjector(modules = SubApp1Module.class)
    abstract SubApp1Activity contributeSubApp1Activity();
}
