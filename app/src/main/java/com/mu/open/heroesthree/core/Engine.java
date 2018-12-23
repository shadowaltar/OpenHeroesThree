package com.mu.open.heroesthree.core;

import com.mu.open.heroesthree.graphics.GraphicEngine;
import com.mu.open.heroesthree.managers.EntityManager;

public class Engine {
    private boolean isStopping;
    private EntityManager entityManager;

    private GraphicEngine graphics;

    public Engine() {
        isStopping = false;
        entityManager = new EntityManager();
    }

    public void start() {
        while (!isStopping) {
            runOneLoop();
        }
    }

    public void runOneLoop() {

    }

    public void initialize(GraphicEngine graphics) {
        this.graphics = graphics;
        graphics.getCurrentFrameSprites();
    }
}
