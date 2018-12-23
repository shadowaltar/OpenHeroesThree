package com.mu.open.heroesthree.demo;

import com.mu.open.heroesthree.entities.worlds.MapLoadType;
import com.mu.open.heroesthree.entities.worlds.World;
import com.mu.open.heroesthree.entities.worlds.WorldBlueprint;
import com.mu.open.heroesthree.entities.worlds.WorldFactory;

public class DemoWorld extends World {

    public void initialize() {
        WorldFactory factory = new WorldFactory();

        World world = factory.create(createDemoWorldBlueprint());
    }

    private WorldBlueprint createDemoWorldBlueprint() {
        WorldBlueprint blueprint = new WorldBlueprint();
        blueprint.loadType = MapLoadType.OneTime;

        return blueprint;
    }
}
