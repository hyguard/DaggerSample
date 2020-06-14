package com.example.subapp1;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class SubApp1Module {
    @ContributesAndroidInjector
    abstract SubApp1Fragment contriuteSubApp1Fragment();
}
