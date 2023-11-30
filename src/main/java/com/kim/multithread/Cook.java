package com.kim.multithread;

public class Cook extends Thread{
    @Override
    public void run() {
     while(true){
         synchronized (Table.lock){
             if(Table.foodCount == 0){
                 break;
             }else{
                 if(Table.foodFlag == 1){
                     try {
                         Table.lock.wait();
                     } catch (InterruptedException e) {
                         throw new RuntimeException(e);
                     }
                 }else{
                     System.out.println("makeing food");
                     Table.foodFlag = 1;
                     Table.lock.notifyAll();
                 }
             }
         }
     }
    }
}
