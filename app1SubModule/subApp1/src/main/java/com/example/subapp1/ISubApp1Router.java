package com.example.subapp1;

import android.app.Activity;
import android.content.Context;

public interface ISubApp1Router {

    void goMainSub(Context context);

    void goMainSub(Activity activity, int requestCode);
}
