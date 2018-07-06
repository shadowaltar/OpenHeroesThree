package com.mu.open.heroesthree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.mu.open.heroesthree.core.Engine;
import com.mu.open.heroesthree.graphics.GraphicEngine;

public class MainActivity extends AppCompatActivity {

    private GraphicEngine graphics;
    private Engine engine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFullScreen();
        setContentView(R.layout.activity_main);
        initializeEngine();
    }

    private void initializeEngine() {
        engine = new Engine();

        graphics = new GraphicEngine();
        graphics.initialize(this);
        engine.initialize(graphics);
    }

    private void setFullScreen() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
