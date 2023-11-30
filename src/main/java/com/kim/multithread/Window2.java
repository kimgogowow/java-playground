package com.kim.multithread;

public class Window2 implements Runnable {
    int ticket = 0;//no static-here as i am using runnable,thus the whole class will be sent as a paramater in the thread
    //static Object obj = new Object();
    @Override
    public void run() {
        while(true){
            if(method()) break;
        }
    }
    private synchronized boolean method(){
        if (ticket == 100){
            return true;
        }else{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName()+" is selling ticket: "+ticket);
        }
        return false;
    }
}
