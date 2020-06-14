package com.example.daggersample.dagger.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.example.daggersample.sub.MainSubActivity;
import com.example.subapp1.ISubApp1Router;

public class SubApp1Router implements ISubApp1Router {
    @Override
    public void goMainSub(Context context) {
        Intent intent = new Intent(context, MainSubActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void goMainSub(Activity activity, int requestCode) {
        if (requestCode > 0) {
            Intent intent = new Intent(activity, MainSubActivity.class);
            activity.startActivityForResult(intent, requestCode);
        } else {
            goMainSub(activity);
        }
    }
}
