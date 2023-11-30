package com.kim.multithread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Window3 extends Thread {
    static int ticket = 0;//no static-here as i am using runnable,thus the whole class will be sent as a paramater in the thread
    //static Object obj = new Object();

    static Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            if(method()) break;
        }
    }
    private synchronized boolean method(){
        lock.lock();
        try{
            if (ticket == 100){
                return true;
            }else{
                Thread.sleep(100);
                ticket++;
                System.out.println(Thread.currentThread().getName()+" is selling ticket: "+ticket);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }

        return false;
    }
}
