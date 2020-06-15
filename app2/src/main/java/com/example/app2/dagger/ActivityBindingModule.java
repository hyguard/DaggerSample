package com.example.app2.dagger;

import com.example.app2.dagger.subcomponent.subapp3.SubApp3ActivityBinder;
import com.example.app2.dagger.subcomponent.subapp4.SubApp4Module;
import com.example.subapp2.SubApp2Activity;
import com.example.subapp2.SubApp2Module;
import com.example.subapp4.SubApp4Activity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(includes = SubApp3ActivityBinder.class)
public abstract class ActivityBindingModule {
    @ContributesAndroidInjector(modules = SubApp2Module.class)
    abstract SubApp2Activity contributeSubApp2Activity();

    @ContributesAndroidInjector(modules = SubApp4Module.class)
    abstract SubApp4Activity contributeSubApp4Activity();
}
