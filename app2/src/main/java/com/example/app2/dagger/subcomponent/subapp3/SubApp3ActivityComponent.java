package com.example.app2.dagger.subcomponent.subapp3;

import com.example.subapp3.SubApp3Activity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

//@UserScope
@Subcomponent(modules = {
        SubApp3Module.class
})
public interface SubApp3ActivityComponent extends AndroidInjector<SubApp3Activity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SubApp3Activity> {
    }
}
