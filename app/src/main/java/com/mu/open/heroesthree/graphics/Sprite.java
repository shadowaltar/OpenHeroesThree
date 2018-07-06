package com.mu.open.heroesthree.graphics;

import android.graphics.Bitmap;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class Sprite {

    private HashMap<String, Bitmap[]> imageFrames = new HashMap<>();

    public Sprite(Bitmap bitmap, HashMap<String, int[][]> dimensions) {
        for (Map.Entry<String, int[][]> pair : dimensions.entrySet()) {
            String key = pair.getKey();
            int[][] dimensionInfo = pair.getValue();
            Bitmap[] frames = createFrames(bitmap, dimensionInfo);

            imageFrames.put(key, frames);
        }
    }

    protected Bitmap[] createFrames(Bitmap image, SpriteInfo info) {
        try {
            Bitmap[] frames = new Bitmap[dimensions.length];
            for (int i = 0; i < dimensions.length; i++) {
                int[] dim = dimensions[i];
                Bitmap part = Bitmap.createBitmap(image, dim[0], dim[1], dim[2], dim[3]);
                frames[i] = part;
            }
            return frames;
        } catch (Exception e) {
            Log.e("Sprite", "Cannot create a sprite frame.", e);
        }
        return null;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }
}
