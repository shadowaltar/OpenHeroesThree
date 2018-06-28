package com.mu.open.heroesthree.graphics;

import android.util.Log;

public class GraphicThread extends Thread {
    private boolean running = false;
    private GraphicEngine engine;

    public GraphicThread(GraphicEngine engine) {
        this.engine = engine;
    }

    public void run() {
        long startTime;
        while (running) {
            startTime = System.nanoTime();
            try {
                engine.lockCanvas();
                engine.drawOneFrame();
            } catch (Exception e) {
                Log.e("GraphicThread", "run: ", e);
            } finally {
                engine.unlockCanvas();
            }
            // throttling
            long now = System.nanoTime();
            long waitTime = (now - startTime) / 1000000;
            if (waitTime < 10) {
                waitTime = 10; // ms
            }
            try {
                // Sleep.
                sleep(waitTime);
            } catch (InterruptedException e) {
            }
        }
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
