package com.mu.open.heroesthree.graphics;

import android.graphics.Bitmap;

public class Sprite {
    private Bitmap bitmap;

    public Sprite(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }
}
