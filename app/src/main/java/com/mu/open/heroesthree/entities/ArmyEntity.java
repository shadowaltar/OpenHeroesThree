package com.mu.open.heroesthree.entities;

import com.mu.open.heroesthree.core.Component;
import com.mu.open.heroesthree.core.Entity;

import java.util.List;

/**
 * An entity for an Army. It contains the following components:
 * * Name
 * * Images and Icons
 * * Faction
 * * Player Owned
 * * Battleground Coordinates
 * * Before battle and current Stack Count
 * * Primary Stats
 * * Damage Stats
 * * Attack type
 * * Ranged-attack shots
 * * Hit Points
 * * Movement Point and Type
 * * Action Sequence
 * * Skills and their usability
 * * Growth per week
 * * Other temporary modifiers
 */
public class ArmyEntity extends Entity {
    public static final EntityType type = EntityType.ARMY;
}
