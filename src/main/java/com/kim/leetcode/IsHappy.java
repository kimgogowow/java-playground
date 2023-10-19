package com.kim.leetcode;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {
    public static boolean solution(int i){
        if(i== 1 || i==-1){
            return true;
        }
        int sumOfCurrent = calSum(i);
        //if not happy- calculation enter a loop
        Set<Integer> set = new HashSet<>();
        while(!set.contains(sumOfCurrent)){
            if(sumOfCurrent==1) return true;
            set.add(sumOfCurrent);
            sumOfCurrent = calSum(sumOfCurrent);

        }
        return false;




    }
    public static int calSum(int i){
        int sum = 0;
        while(i>0){
            int lastNum = i%10;
            sum += lastNum*lastNum;
            i=i/10;
        }
        return sum;
    }

}
