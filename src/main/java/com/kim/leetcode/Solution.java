package com.kim.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int canCompleteCircuit(int[] gas,int[] cost){
        int sgas=0,scost=0,total=0,res = 0;
        for(int i = 0;i<gas.length;i++){
            sgas += gas[i];
            scost += cost[i];
        }
        if(sgas<scost) return -1;

        for(int i =0;i<gas.length;i++){
            total += gas[i]-cost[i];
            if(total<0){
                total = 0;
                res = i+1;
            }
        }
        return res;
    }
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};//13
        String[] elements = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String res = "";
        for(int i = 0;i<values.length;i++){
            int digit = num / values[i];
            for(int j = 0;j<digit;j++){
                res += elements[i];
            }
            num %= values[i];
        }
        return res;
    }
    public int[] productExceptSelf(int[] nums) {
        //238
        int len = nums.length;
        int[] res = new int[len];

        int left = 1;
        for (int i = 0;i<len;i++){
            if(i>0){
                left = left*nums[i-1];
            }
            res[i]=left;
        }
        int right = 1;
        for(int i =len-1;i>=0;i--){
            if(i<len-1){
                right = right*nums[i+1];
            }
            res[i] = res[i]*right;
        }
        return res;
    }

    public String convert(String s, int numRows) {
        //6
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < numRows && i < len; idx++) // vertically down
                sb[idx].append(c[i++]);
            for (int idx = numRows-2; idx >= 1 && i < len; idx--) // obliquely up
                sb[idx].append(c[i++]);
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
    }

}
