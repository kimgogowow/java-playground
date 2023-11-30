package com.kim.multithread;

public class ThreadTwo implements Runnable{
    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+"helloworld!");
        }
    }
    /**
     * 1.define a class to implement Runnable interface
     * 2.override runnable method
     * 3.create the new class object
     * 4.create a thread object and initiate the thread
     */
}
