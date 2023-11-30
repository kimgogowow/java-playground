package com.kim.multithread;

import java.util.concurrent.Callable;

public class ThreadThree implements Callable<Integer> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            Thread.sleep(1000);
            System.out.println("the sum is "+ sum);
            sum+= i;
        }
        return sum;
    }
    /**
     * 1.create a class to implement Callable interface
     * 2.override call method
     * 3.create objects for own class
     * 4.create FutureTask objects
     * 5.create Thread object and initiate
     */
}
