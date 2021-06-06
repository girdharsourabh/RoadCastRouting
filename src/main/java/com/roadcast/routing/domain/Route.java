package com.roadcast.routing.domain;


import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.lookup.PlanningId;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

@PlanningEntity
public class Route {

    @PlanningId
    private Long id;

    @PlanningVariable(valueRangeProviderRefs = "locationRange")
    private Location location;
}
