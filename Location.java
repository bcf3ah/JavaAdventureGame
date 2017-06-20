package com.brian;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Brian on 6/20/2017.
 */
public class Location {
    private final int locationId;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationId, String description) {
        this.locationId = locationId;
        this.description = description;
        this.exits = new HashMap<>();
        this.exits.put("Q", 0);
    }

    public void addExit(String direction, int location){
        exits.put(direction, location);
    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits); //returns a copy of exits so we don't affect our original exit map
    }
}
