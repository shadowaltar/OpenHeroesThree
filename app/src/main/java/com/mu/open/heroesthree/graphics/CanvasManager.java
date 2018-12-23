package com.mu.open.heroesthree.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.SurfaceView;

public class CanvasManager {

    private SurfaceView view;

    public CanvasManager(SurfaceView view) {
        this.view = view;
    }

    public void drawCenter(Bitmap image, Canvas canvas) {
        float imgW = image.getWidth();
        float imgH = image.getHeight();
        float viewW = view.getWidth();
        float viewH = view.getHeight();
        canvas.drawBitmap(image, (viewW - imgW) / 2, (viewH - imgH) / 2, null);
    }
}
