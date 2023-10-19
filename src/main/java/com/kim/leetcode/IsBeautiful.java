package com.kim.leetcode;

public class IsBeautiful {
    public long isBeautiful(long n ,long target){
        long base = 1;
        long n0 = n;

        while(calSum(n)>target){
            n = n/10 +1;//remove the last digit and round up to previous digit
            base *= 10;
        }
        return base * n - n0;

    }
    public long calSum(long i){
        long sum = 0 ;
        while(i>0){
            long lastDigit = i % 10;
            sum += lastDigit;
            i /= 10;
        }
        return sum;
    }
}
