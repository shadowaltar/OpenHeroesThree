package com.mu.open.heroesthree.core;

import com.mu.open.heroesthree.managers.EntityManager;

public class Engine {
    private boolean isStopping;
    private EntityManager entityManager;

    public Engine() {
        isStopping=false;
        entityManager = new EntityManager();
        entityManager.initialize();
    }

    public void start(){
        while(!isStopping){
            run();
        }
    }
    public void run(){

    }
}
