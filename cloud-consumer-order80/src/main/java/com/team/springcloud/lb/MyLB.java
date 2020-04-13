package com.team.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description TODO
 * @ClassName MyLB.java
 * @Author HuangXuPing
 * @CreateTime 2020年04月13日 21:54:00
 * @Version 1.0
 * @History
 **/
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;

        } while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("*****第几次访问，次数next:  " + next);
        return next;
    }

    //负载均衡算法：rest接口第几次请求数   %  服务器集群总数量=实际调用服务器位置下标，每次服务重启后rest接口计数从1开始
    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {

        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
