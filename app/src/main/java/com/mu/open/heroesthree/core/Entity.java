package com.mu.open.heroesthree.core;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity {
    public long id;
    public List<Component> components = new ArrayList<>();
}
