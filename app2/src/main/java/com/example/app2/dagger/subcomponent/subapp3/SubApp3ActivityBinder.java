package com.example.app2.dagger.subcomponent.subapp3;

import com.example.subapp3.SubApp3Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = SubApp3ActivityComponent.class)
public abstract class SubApp3ActivityBinder {

    @Binds
    @IntoMap
    @ClassKey(SubApp3Activity.class)
    public abstract AndroidInjector.Factory<?> subApp3Activity(SubApp3ActivityComponent.Builder builder);
}
