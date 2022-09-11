package com.linkedin.singleton;

import javax.ejb.Singleton;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

@Singleton
public class PoolManager {

    private Queue<Object> pooledObjects = new LinkedBlockingQueue<Object>(1000);

    public PoolManager() {
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
