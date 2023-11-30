package com.kim.multithread;

public class ThreadOne extends Thread{
    public void run(){
        for(int i = 0;i<100;i++){
            System.out.println(getName()+"is running"+" "+i);
        }
    }
}
