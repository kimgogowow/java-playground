package com.kim.multithread;

public class Foodie extends Thread{
    @Override
    public void run() {
        //1.loop
        //2.syn code block
        //3.reached condition
        //4.not reach condition

        while(true){
            synchronized (Table.lock){
                if(Table.foodCount==0){
                    break;
                }else{
                    if(Table.foodFlag==0){
                        try {
                            Table.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        Table.foodCount--;
                        System.out.println("foodie is eating the food and can eat "+Table.foodCount+" dishes");
                        Table.lock.notifyAll();
                        Table.foodFlag = 0;

                    }



                }
            }
        }
    }
}
