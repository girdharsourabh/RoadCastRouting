package com.roadcast.routing.controller;

import com.roadcast.routing.cache.RoutingCache;
import com.roadcast.routing.domain.RoutingHolder;
import com.roadcast.routing.domain.VehicleRoutingSolution;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController("routing")
@Slf4j
public class RoutingController {

    @Autowired
    private RoutingCache cache;

    @GetMapping("getRoute")
    public ResponseEntity<VehicleRoutingSolution> getSolution(UUID uuid){

        return null;
    }

    @PostMapping("createRoute")
    public ResponseEntity<UUID> createRoute(){
        //TODO - capture all data from reqeust body and create collections of locaiton, vehicles etc
        // then create a routing holder object, start the solve and put that in cache.
        // return a unique id to track this case.


        return null;
    }

    @GetMapping("getRouteStatus")
    public ResponseEntity<String> getRouteStatus(UUID uuid){
        RoutingHolder routingHolder = cache.get(uuid);
        /*if (solverManager != null){
            //SolverStatus status = solverManager.getSolverStatus();
        }*/
        return null;
    }

    @PostMapping("stopRouting")
    public ResponseEntity<VehicleRoutingSolution> stopSolving(UUID uuid){
        //TODO - get solvermanager for this instance and then stp the solve and give the current available solution
        return null;
    }
}
