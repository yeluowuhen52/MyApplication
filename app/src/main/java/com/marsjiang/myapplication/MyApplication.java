package com.marsjiang.myapplication;

import android.app.Application;
import android.support.multidex.MultiDex;

/**
 * @author Jiang
 * @date 2018-11-30
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }
}
