package com.mu.open.heroesthree.framework;

import android.app.Application;
import android.content.res.Resources;

public class App {
    private static App app;
    private Resources resources;

    private App(Application application) {
        this.resources = application.getResources();
    }

    public static Resources getResources() {
        return app.resources;
    }

    public static void initialize(Application application) {
        if (app == null)
            app = new App(application);
    }
}
