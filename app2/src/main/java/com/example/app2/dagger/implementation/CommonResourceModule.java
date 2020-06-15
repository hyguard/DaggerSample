package com.example.app2.dagger.implementation;

import android.app.Application;

import com.example.app2.R;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonResourceModule {
    @Provides
    @Named("name_1")
    public String provideCommonResourceByNamed(Application application) {
        return application.getApplicationContext().getResources().getString(R.string.qualifier_name_1);
    }

    @Provides
    @Named("name_2")
    public String provideCommonResourceByNamed2(Application application) {
        return application.getApplicationContext().getResources().getString(R.string.qualifier_name_2);
    }

//    @Provides
//    public String provideCommonResource(Application application) {
//        return "string provided from component";
//    }
}
