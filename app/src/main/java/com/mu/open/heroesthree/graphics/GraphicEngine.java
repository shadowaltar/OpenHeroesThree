package com.mu.open.heroesthree.graphics;

import android.content.Context;
import android.graphics.Canvas;

import com.mu.open.heroesthree.R;

public class GraphicEngine {
    private final SpriteManager spriteManager;

    private GraphicSurface surface;
    private GraphicThread runner;
    private Context context;
    private Canvas canvas;

    public GraphicEngine() {
        spriteManager = new SpriteManager();
    }

    public void initialize(Context context) {
        this.context = context;
        surface = new GraphicSurface(context);
        runner = new GraphicThread(this);
    }

    public Sprite[] getCurrentFrameSprites() {

        Sprite sprite = spriteManager.readFromResource(R.drawable.default_tile_set);
        return null;
    }

    public void start() {
        runner.setRunning(true);
        runner.start();
    }

    public void stop() {
        runner.setRunning(false);
    }

    public void lockCanvas() {
        canvas = surface.getHolder().lockCanvas();
    }

    public void unlockCanvas() {
        if (canvas != null)
            surface.getHolder().unlockCanvasAndPost(canvas);
    }

    public void drawOneFrame() {
        if (canvas == null)
            return;
        synchronized (canvas) {
            surface.update();
            surface.draw(canvas);
        }
    }
}
