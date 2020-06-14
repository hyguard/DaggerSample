package com.example.daggersample.dagger;

import android.app.Application;

import com.example.daggersample.App1Application;
import com.example.daggersample.dagger.implementation.CommonResourceModule;
import com.example.daggersample.dagger.router.RouterModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        ActivityBindingModule.class,
        CommonResourceModule.class,
        RouterModule.class
})
public interface App1Component extends AndroidInjector<App1Application> {
    void inject(App1Application app1Application);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        App1Component build();
    }
}
