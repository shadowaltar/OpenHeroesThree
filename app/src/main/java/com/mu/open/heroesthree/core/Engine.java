package com.mu.open.heroesthree.core;

import com.mu.open.heroesthree.managers.ComponentManager;
import com.mu.open.heroesthree.managers.EntityManager;

public class Engine {
    private boolean isStopping;
    private EntityManager entityManager;
    private ComponentManager componentManager;

    public Engine() {
        isStopping = false;
        entityManager = new EntityManager();
    }

    public void start(RunMode mode) {
        if (mode == RunMode.TEST) {
            entityManager.initialize();
            componentManager.initialize();
            entityManager.addMap();

        }
    }

    public void start() {
        while (!isStopping) {
            runOneLoop();
        }
    }

    public void runOneLoop() {

    }
}
