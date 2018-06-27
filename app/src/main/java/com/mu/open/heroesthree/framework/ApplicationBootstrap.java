package com.mu.open.heroesthree.framework;

import android.app.Application;

public class ApplicationBootstrap extends Application {

    public void onCreate() {
        super.onCreate();
        App.initialize(this);
    }
}
