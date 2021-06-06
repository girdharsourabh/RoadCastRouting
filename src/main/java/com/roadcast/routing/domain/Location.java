package com.roadcast.routing.domain;

public class Location {

    private final Coordinates coordinates;
    private final String description;

    public Location(Coordinates coordinates, String description) {
        this.coordinates = coordinates;
        this.description = description;
    }
}
