package com.mu.open.heroesthree.entities;

import com.mu.open.heroesthree.states.State;

import java.util.List;
import java.util.Map;

public abstract class Entity {

    public long id;
    /**
     * A collection of (current) states of the entity.
     */
    public Map<String, State> currentStates = null;
}
