package com.roadcast.routing.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

//@Component
public class CacheCleaner {

    //TOOD - implemented cache as auto clean up so not needed now

    @Autowired
    private RoutingCache cache;


    // clear old items every 30 mins
    @Scheduled(fixedRate = 30 * 60 * 1000)
    public void clearStaleCache(){

    }
    
}
