package com.kim.multithread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        ThreadOne to111 = new ThreadOne();
        ThreadOne to222 = new ThreadOne();
        to111.setName("1111thread111");
        to222.setName("2222thread222");
        to111.start();
        to222.start();

        ThreadTwo mt2 = new ThreadTwo();
        Thread t1 = new Thread(mt2);
        Thread t2 = new Thread(mt2);
        t1.setName("t1111");
        t2.setName("t2222");
        t1.start();
        t2.start();

        //create callable object-the task that the multi-thread need to execute
        ThreadThree t3 = new ThreadThree();
        //create futuretask object-to manage the result
        FutureTask<Integer> ft = new FutureTask<>(t3);
        //create the thread object
        Thread td3 =  new Thread(ft);
        td3.start();

        //obtain the result
        Integer result = ft.get();
        System.out.println("the result of thread three is "+result);

        Thread.sleep(5000);
        System.out.println("------11111111-------");
        Thread.sleep(5000);
        System.out.println("------22222222-------");


        ThreadOne t1 = new ThreadOne();
        ThreadOne t2 = new ThreadOne();
        t1.setName("女神");
        t2.setName("备胎");
        t1.setPriority(1);
        t2.setDaemon(true);
        t1.start();
        t2.start();
 */
/*

        //a cinema is selling 100 tickets in three windows
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("w1");
        w2.setName("w2");
        w3.setName("w3");

        w1.start();
        w2.start();
        w3.start();

        //same case but use synchronized in method
        System.out.println(

                "----------------------------------"
        );
        Window2 window2 = new Window2();
        Thread win1 = new Thread(window2);
        Thread win2 = new Thread(window2);
        Thread win3 = new Thread(window2);
        win1.setName("win1");
        win2.setName("win2");
        win3.setName("win3");

        win1.start();
        win2.start();
        win3.start();

        Window3 window2 = new Window3();
        Thread win1 = new Thread(window2);
        Thread win2 = new Thread(window2);
        Thread win3 = new Thread(window2);
        win1.setName("win1");
        win2.setName("win2");
        win3.setName("win3");

        win1.start();
        win2.start();
        win3.start();
 */

        //等待唤醒机制-wait，notify，notifyall
        //eg:cook-table-foodie

        Cook c = new Cook();
        Foodie f = new Foodie();

        c.setName("cook");
        f.setName("foodie");

        c.start();
        f.start();


    }

}