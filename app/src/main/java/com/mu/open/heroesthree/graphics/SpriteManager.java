package com.mu.open.heroesthree.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import com.mu.open.heroesthree.R;
import com.mu.open.heroesthree.framework.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SpriteManager {

    private HashMap<String, SpriteInfo[]> spriteInfos;

    public SpriteManager() {

    }

    public synchronized Sprite readFromResource(int imageResId, int dimensionInfoResId) {
        Bitmap bitmap = BitmapFactory.decodeResource(App.getResources(), imageResId);
        List<String> rawDimensions = readText(dimensionInfoResId);
        HashMap<String, int[][]> dimensions = new HashMap<>();
        for (int i = 0; i < rawDimensions.size(); i++) {
            SpriteInfo spriteInfo = parseInfo(rawDimensions.get(i));
        }
        Sprite sprite = new Sprite(bitmap, dimensions);
        return sprite;
    }

    public static void initializeDefaultSpriteInfos() {
        List<String> rawInfoStrings = readText(R.raw.default_tile_set_descriptor);
        for (int i = 0; i < rawInfoStrings.size(); i++) {
            SpriteInfo spriteInfo = parseInfo(rawInfoStrings.get(i));
        }
    }

    public static List<String> readText(int resId) {
        List<String> result = new ArrayList<>();
        InputStream inputStream = App.getResources().openRawResource(resId);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                if (line == "") continue;
                result.add(line);
            }
        } catch (IOException e) {
            Log.e("SpriteManager", "Cannot read text file, id is " + resId, e);
            return result;
        }
        return result;
    }

    /**
     * Parse a given string to sprite image info.
     *
     * @param infoStr
     * @return
     */
    public static SpriteInfo parseInfo(String infoStr) {
        if (infoStr == null || infoStr == "") return null;
        try {
            String[] parts = infoStr.split(" ");
            SpriteInfo info = new SpriteInfo();
            info.spriteKey = parts[0];
            parts = parts[1].split(",");
            info.frame = Integer.parseInt(parts[0]);
            info.xInSource = Integer.parseInt(parts[1]);
            info.yInSource = Integer.parseInt(parts[2]);
            info.widthInSource = Integer.parseInt(parts[3]);
            info.heightInSource = Integer.parseInt(parts[4]);
            return info;
        } catch (Exception e) {
            Log.w("SpriteManager", "Failed to parse sprite image info, input string is: " + infoStr);
            return null;
        }
    }
}
