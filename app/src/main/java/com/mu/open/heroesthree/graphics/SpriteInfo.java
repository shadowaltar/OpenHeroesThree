package com.mu.open.heroesthree.graphics;

import java.util.Objects;

public class SpriteInfo {
    public int xInSource;
    public int yInSource;
    public int widthInSource;
    public int heightInSource;
    public String spriteKey;
    public int frame;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpriteInfo that = (SpriteInfo) o;
        return frame == that.frame &&
                Objects.equals(spriteKey, that.spriteKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spriteKey, frame);
    }
}
