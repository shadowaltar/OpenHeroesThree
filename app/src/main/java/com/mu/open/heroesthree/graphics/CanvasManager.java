package com.mu.open.heroesthree.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.SurfaceView;

public class CanvasManager {

    private SurfaceView view;

    public CanvasManager(SurfaceView view) {
        this.view = view;
    }

    public void drawCenter(Sprite sprite, Canvas canvas) {
        Bitmap image = sprite.getBitmap();
        float imgW = image.getWidth();
        float imgH = image.getHeight();
        float viewW = view.getWidth();
        float viewH = view.getHeight();
        canvas.drawBitmap(sprite.getBitmap(),
                (viewW-imgW)/2, (viewH-imgH)/2,null);
    }
}
