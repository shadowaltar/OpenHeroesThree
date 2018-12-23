package com.mu.open.heroesthree.utils;

public class IdGen {
    private static int id = 0;
    public static int next(){
        return id++;
    }
}
