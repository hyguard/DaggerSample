package com.example.app2.dagger.subcomponent.subapp3;

import dagger.Module;
import dagger.Provides;

@Module
public class SubApp3Module {
    //    @Singleton    // occur error : (unscoped) may not reference scoped bindings
//    @UserScope    // user scope required.
    @Provides
    public int provide10Integer() {
        return 10;
    }

    @Provides
    public String provideStringTest() {
        return "abcdefg";
    }
}
