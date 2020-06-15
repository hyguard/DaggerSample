package com.example.subapp2;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class SubApp2Module {
    @ContributesAndroidInjector
    abstract SubApp2Fragment contriuteSubApp2Fragment();
}
