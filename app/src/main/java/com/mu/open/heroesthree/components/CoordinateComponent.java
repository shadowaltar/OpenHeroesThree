package com.mu.open.heroesthree.components;

import com.mu.open.heroesthree.core.Component;

public class CoordinateComponent extends Component {
    public CoordinateType type;
    public int x;
    public int y;
    public int z;

    public CoordinateComponent(CoordinateType type) {
        this.type = type;
    }
}
