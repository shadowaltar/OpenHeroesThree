package com.mu.open.heroesthree.entities.worlds;

import com.mu.open.heroesthree.entities.Entity;
import com.mu.open.heroesthree.entities.players.Player;

import java.util.List;

public class World extends Entity {

    // map
    public Map map;
    // objects on the map
    public List<Entity> mapObjects;
    // players
    public List<Player> players;

    
}
