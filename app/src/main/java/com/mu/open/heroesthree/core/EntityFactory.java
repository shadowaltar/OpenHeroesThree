package com.mu.open.heroesthree.core;

import com.mu.open.heroesthree.components.*;
import com.mu.open.heroesthree.components.AnimationComponent;
import com.mu.open.heroesthree.components.AttackTypeComponent;
import com.mu.open.heroesthree.components.CityStructureComponent;
import com.mu.open.heroesthree.components.CoordinateComponent;
import com.mu.open.heroesthree.components.CoordinateType;
import com.mu.open.heroesthree.components.CountComponent;
import com.mu.open.heroesthree.components.DamageStatisticsComponent;
import com.mu.open.heroesthree.components.LevelComponent;
import com.mu.open.heroesthree.components.FactionComponent;
import com.mu.open.heroesthree.components.GrowthComponent;
import com.mu.open.heroesthree.components.HitPointComponent;
import com.mu.open.heroesthree.components.IconComponent;
import com.mu.open.heroesthree.components.ModifierTargetComponent;
import com.mu.open.heroesthree.components.MovementComponent;
import com.mu.open.heroesthree.components.NameComponent;
import com.mu.open.heroesthree.components.OwnerComponent;
import com.mu.open.heroesthree.components.PrimaryStatisticsComponent;
import com.mu.open.heroesthree.components.ShotComponent;
import com.mu.open.heroesthree.components.SkillsComponent;
import com.mu.open.heroesthree.entities.ArmyEntity;
import com.mu.open.heroesthree.entities.EntityType;
import com.mu.open.heroesthree.entities.HeroEntity;
import com.mu.open.heroesthree.entities.MapEntity;
import com.mu.open.heroesthree.entities.StructureEntity;

public class EntityFactory {
    public Entity create(EntityBlueprint blueprint) {
        if (blueprint == null) throw new IllegalArgumentException();

        Entity entity = null;
        if (blueprint.type == EntityType.ARMY) {
            entity = new ArmyEntity();
            entity.components.add(new AnimationComponent());
            entity.components.add(new CoordinateComponent(CoordinateType.BATTLEFIELD));
            entity.components.add(new CountComponent());
            entity.components.add(new PrimaryStatisticsComponent());
            entity.components.add(new DamageStatisticsComponent());
            entity.components.add(new AttackTypeComponent());
            entity.components.add(new ShotComponent());
            entity.components.add(new HitPointComponent());
            entity.components.add(new MovementComponent());
            entity.components.add(new ActionSequenceComponent());
            entity.components.add(new SkillsComponent());
            entity.components.add(new GrowthComponent());
            entity.components.add(new ModifierTargetComponent());
        } else if (blueprint.type == EntityType.CITY) {
            entity = new StructureEntity();
            addGeneralComponents(entity);
            entity.components.add(new CoordinateComponent(CoordinateType.WORLD_MAP));
            entity.components.add(new CityStructureComponent());
        } else if (blueprint.type == EntityType.STRUCTURE) {
            entity = new StructureEntity();
            addGeneralComponents(entity);
            entity.components.add(new CoordinateComponent(CoordinateType.WORLD_MAP));
            entity.components.add(new ModifierProviderComponent());
        } else if (blueprint.type == EntityType.HERO) {
            entity = new HeroEntity();
            addGeneralComponents(entity);
            entity.components.add(new ArmiesComponent());
            entity.components.add(new PrimaryStatisticsComponent());
            entity.components.add(new ArtifactsComponent());
            entity.components.add(new SkillsComponent());
            entity.components.add(new LevelComponent());
            entity.components.add(new MagicComponent());
            entity.components.add(new CoordinateComponent(CoordinateType.WORLD_MAP));
            entity.components.add(new MovementComponent());
            entity.components.add(new ModifierTargetComponent());
        } else if (blueprint.type == EntityType.MAP) {
            entity = new MapEntity();
            addGeneralComponents(entity);
        }
        return entity;
    }

    private void addGeneralComponents(Entity entity) {
        entity.components.add(new NameComponent());
        entity.components.add(new IconComponent());
        entity.components.add(new FactionComponent());
        entity.components.add(new OwnerComponent());
    }

    public Entity newMap() {
        return create(EntityBlueprint.map());
    }
}
