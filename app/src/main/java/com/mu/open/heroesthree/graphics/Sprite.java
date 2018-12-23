package com.mu.open.heroesthree.graphics;

import android.graphics.Bitmap;
import android.util.Log;

import java.util.HashMap;
import java.util.List;

public class Sprite {

    private HashMap<String, Bitmap> imageFrames = new HashMap<>();

    public Sprite(Bitmap bitmap, List<SpriteInfo> dimensions) {
        for (SpriteInfo spriteInfo : dimensions) {
            Bitmap frame = createFrame(bitmap, spriteInfo);

            imageFrames.put(spriteInfo.spriteKey, frame);
        }
    }

    protected Bitmap createFrame(Bitmap bitmapSource, SpriteInfo info) {
        try {
            return Bitmap.createBitmap(bitmapSource, info.xInSource, info.yInSource,
                    info.widthInSource, info.heightInSource);
        } catch (Exception e) {
            Log.e("Sprite", "Cannot create a sprite frame.", e);
        }
        return null;
    }
}
