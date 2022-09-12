package com.linkedin.singleton;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

@Startup
@Singleton
@DependsOn("Configuration")
public class PoolManager {
    private Queue<Object> pooledObjects;

    @PostConstruct
    public void constructObjects() {
        pooledObjects = new LinkedBlockingQueue<Object>(1000);

        for (int i = 0; i < 1000; i++) {
            pooledObjects.offer(new Object());
        }
    }

    public void returnObject(Object obj) {
        pooledObjects.offer(obj);
    }

    public Object borrowObject() {
        return pooledObjects.poll();
    }
}
