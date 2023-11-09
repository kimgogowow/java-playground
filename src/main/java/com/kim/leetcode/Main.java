package com.kim.leetcode;

public class Main {
    public static void main(String[] args) {
        /*
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
        Hindex s2 = solution;
        int[] citations = {1,2,5,7};
        System.out.println(solution.hIndex(citations));

        System.out.println(solution.equals(s2));

        int x = solution.hashCode();


         */
        /*
        * equls vs ==
        *
        * String a = "h1";
        * String b = "h1";
        *
        * a == b; false
        * a.equals(b); true
        *
        * A a1 = new A();
        * A a2 = new A();
        *
        * a1.equals(a2); false;
        *
        *
        *
        * */

        Solution solution2 = new Solution();
        int[] gas = {1,2,3,4,5};
        int[] cost ={3,4,5,1,2};
        int res = solution2.canCompleteCircuit(gas,cost);
        System.out.println(res);
    }
}
