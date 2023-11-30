package com.kim.multithread;

public class Table{
    //0-there is no food, 1-there is food
    public static int foodFlag = 0;
    public static int foodCount = 10;
    //lock object
    public static Object lock = new Object();
}
