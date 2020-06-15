package com.example.app2.dagger;

import android.app.Application;

import com.example.app2.App2Application;
import com.example.app2.dagger.implementation.CommonResourceModule;

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
})
public interface App2Component extends AndroidInjector<App2Application> {
    void inject(App2Application app1Application);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        App2Component build();
    }
}
