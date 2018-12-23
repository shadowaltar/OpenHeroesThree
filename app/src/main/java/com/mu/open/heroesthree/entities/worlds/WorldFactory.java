package com.mu.open.heroesthree.entities.worlds;

import com.mu.open.heroesthree.utils.IdGen;

public class WorldFactory {


    public MapLoadType loadType;

    public World create(WorldBlueprint blueprint) {
        World world = new World();
        world.id = IdGen.next();

        return world;
    }

    public void loadWorldRegion() {

    }
}
