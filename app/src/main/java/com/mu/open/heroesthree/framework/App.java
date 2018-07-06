package com.mu.open.heroesthree.framework;

import android.app.Application;
import android.content.res.Resources;
import android.net.Uri;

import com.mu.open.heroesthree.R;

public class App {
    private static App app;
    private Resources resources;
    private String packageName;

    private App(Application application) {
        this.resources = application.getResources();
        this.packageName = application.getPackageName();
    }

    public static Resources getResources() {
        return app.resources;
    }

    public static void initialize(Application application) {
        if (app == null)
            app = new App(application);
    }

    public static String getPackageName() {
        return app.packageName;
    }

    public static String getURLForResource(int resourceId) {
        return Uri.parse("android.resource://" + R.class.getPackage().getName() + "/" + resourceId).toString();
    }
}
