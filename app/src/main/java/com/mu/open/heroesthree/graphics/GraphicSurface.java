package com.mu.open.heroesthree.graphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GraphicSurface extends SurfaceView implements SurfaceHolder.Callback {

    /**
     * Create a instance that hosts all the graphical activity.
     * It needs to be associated to an Activity.
     *
     * @param context
     */
    public GraphicSurface(Context context) {
        super(context);
        setFocusable(true);
        getHolder().addCallback(this);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        clean(canvas);
    }


    public void clean(Canvas canvas) {
        canvas.drawColor(Color.BLACK);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    /**
     * Update the things need to be drawn
     */
    public void update() {

    }
}
