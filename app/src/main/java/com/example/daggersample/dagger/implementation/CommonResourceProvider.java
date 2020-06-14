package com.example.daggersample.dagger.implementation;

import android.app.Application;

import com.example.daggersample.R;
import com.example.subapp1.ICommonResource;

public class CommonResourceProvider implements ICommonResource {
    private Application application;

    CommonResourceProvider(Application application) {
        this.application = application;
    }

    @Override
    public String getCommonResource1() {
        return application.getResources().getString(R.string.common_string);
    }

    @Override
    public String getCommonResource2() {
        return application.getResources().getString(R.string.hello_world);
    }
}
