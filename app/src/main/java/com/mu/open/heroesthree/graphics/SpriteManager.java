package com.mu.open.heroesthree.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.mu.open.heroesthree.framework.App;

public class SpriteManager {

    public final String currentPath;
    private ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

    public SpriteManager() {
        currentPath = classLoader.getResource(".").getPath();
    }

    public Sprite readFromResource(int resourceId) {
        Bitmap bitmap = BitmapFactory.decodeResource(App.getResources(), resourceId);

        Sprite sprite = new Sprite(bitmap);
        return sprite;
    }
}
