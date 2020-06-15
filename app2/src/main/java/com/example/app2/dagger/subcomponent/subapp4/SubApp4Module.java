package com.example.app2.dagger.subcomponent.subapp4;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class SubApp4Module {
    int next = 100;

    @Provides
    public int provideInteger() {
        Log.d("injections", "provideInteger - computing...");
        return next++;
    }
}
