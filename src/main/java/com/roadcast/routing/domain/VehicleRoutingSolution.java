package com.roadcast.routing.domain;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

import java.util.List;

@PlanningSolution
public class VehicleRoutingSolution {

    @PlanningEntityCollectionProperty
    private List<Location> locationList;

    @ValueRangeProvider(id = "vehicleRange")
    private List<Vehicle> vehicleList;

    /*@ProblemFactCollectionProperty
    private List<PlanningDepot> depotList;
    @PlanningEntityCollectionProperty

    @PlanningEntityCollectionProperty
    @ValueRangeProvider(id = "visitRange")
    private List<PlanningVisit> visitList;*/




    @PlanningScore
    private HardSoftScore score;
}
