package com.roadcast.routing.cache;

import com.roadcast.routing.domain.RoutingHolder;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RoutingCache {
    private long maxAge;
    private InMemoryCache<UUID, RoutingHolder> store;

    /**
     * Instantiate a cache with max age of 1 hour
     */
    public RoutingCache() {
        this.maxAge = 1000 * 60 * 60;
        this.store = new InMemoryCache<>(60*60, 20*60, 300);
    }


    public void put(UUID key, RoutingHolder routingHolder) {
        store.put(key, routingHolder);
    }



    /**
     * Fetch an object or store.
     * @param key unique identifier to retrieve object
     * @return an object
     */
    public synchronized RoutingHolder get(UUID key) {
        RoutingHolder item = store.get(key);
        return item;
    }

    /**
     * Remove an object from cache.
     * @param key unique identifier to retrieve object
     */
    public void remove(UUID key) {
        store.remove(key);
    }

}

