package com.mu.open.heroesthree.core;

import com.mu.open.heroesthree.entities.EntityType;

public class EntityBlueprint {
    public EntityType type;

    public static EntityBlueprint hero() {
        EntityBlueprint blueprint = new EntityBlueprint();
        blueprint.type = EntityType.ARMY;
        return blueprint;
    }
    public static EntityBlueprint map() {
        EntityBlueprint blueprint = new EntityBlueprint();
        blueprint.type = EntityType.MAP;
        return blueprint;
    }
}
