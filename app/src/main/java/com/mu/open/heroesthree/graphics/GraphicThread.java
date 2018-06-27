package com.mu.open.heroesthree.graphics;

import android.graphics.Canvas;
import android.util.Log;
import android.view.SurfaceHolder;

public class GraphicThread extends Thread {
    private int fps = 20;
    private boolean isRunning = false;
    private final GraphicSurface view;
    private final SurfaceHolder holder;

    public GraphicThread(GraphicSurface view, SurfaceHolder holder) {
        this.view = view;
        this.holder = holder;
    }

    public void run() {
        while (isRunning) {
            Canvas canvas = null;
            try {
                canvas = view.getHolder().lockCanvas();
                synchronized (view.getHolder()) {
                    view.draw(canvas);
                }
            } catch (Exception e) {
                Log.e("GraphicThread", "run: ", e);
            } finally {
                if (canvas != null) {
                    view.getHolder().unlockCanvasAndPost(canvas);
                }
            }
        }
    }
}
