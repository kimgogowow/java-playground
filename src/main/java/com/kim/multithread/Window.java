package com.kim.multithread;

public class Window extends Thread{
    static int ticket = 0;
    //static Object obj = new Object();
    @Override
    public void run() {
        while(true){
            synchronized(Window.class){//the synchronized object is unique in this way
                if(ticket<100){
                    ticket++;
                    System.out.println(getName()+" is selling ticket number: "+ ticket);
                }else{
                    System.out.println(getName()+" sold the last one");
                    break;
                }
            }
        }
    }
}
