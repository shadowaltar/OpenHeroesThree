package com.mu.open.heroesthree.graphics;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GraphicSurface extends SurfaceView implements SurfaceHolder.Callback {

    private GraphicThread graphicThread;
    private Canvas canvas;

    /**
     * Create a instance that hosts all the graphical activity.
     * It needs to be associated to an Activity.
     *
     * @param activity
     */
    public GraphicSurface(Activity activity) {
        super(activity);
        setFocusable(true);
        getHolder().addCallback(this);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        this.canvas = canvas;
        cleanCanvas();
    }

    public void cleanCanvas() {
        canvas.drawColor(Color.BLACK);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        graphicThread = new GraphicThread(this, holder);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        canvas=null;
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        canvas=null;
    }
}
