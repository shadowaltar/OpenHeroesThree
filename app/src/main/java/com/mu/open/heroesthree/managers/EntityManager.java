package com.mu.open.heroesthree.managers;

import com.mu.open.heroesthree.core.Entity;
import com.mu.open.heroesthree.core.EntityBlueprint;
import com.mu.open.heroesthree.core.EntityFactory;

import java.util.ArrayList;
import java.util.List;

public class EntityManager {
    public List<Entity> entities = new ArrayList<>();
    public EntityFactory factory = new EntityFactory();

    public List<Entity> maps = new ArrayList<>();

    public void initialize() {
        factory.create(new EntityBlueprint());
    }

    public void addMap() {
        Entity entity = factory.newMap();
        maps.add(entity);
    }
}
