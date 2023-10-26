package com.kim.leetcode;

public class Main {
    public static void main(String[] args) {
        int checkNum = 49;
        long checkLong = 89;
        long target = 5;
        //202
        IsHappy isHappyCheck = new IsHappy();

        System.out.println("the result of checking "+ checkNum+" is "+isHappyCheck.solution(checkNum));
        //263
        IsUgly isUglyCheck = new IsUgly();
        System.out.println("the result of checking "+ checkNum+" is "+isUglyCheck.solution(checkNum));

        //2457
        IsBeautiful isBeautiful = new IsBeautiful();
        System.out.println("the result of "+ checkLong+" is "+isBeautiful.isBeautiful(checkLong,target));

        //274
        Hindex solution = new Hindex();
        int[] citations = {1,2,4,6,4,2,4,6,9};
        System.out.println(solution.hIndex(citations));

    }
}
