package com.kim.leetcode;

import java.util.Arrays;

public class Hindex {
    public int hIndex(int[] citations) {
        int left = 0;
        int right = citations.length;

        while(left<right){
            int mid = (left+right+1)/2;
            int count = 0;

            for(int i = 0 ; i<citations.length;i++){
                if(citations[i] >= mid) count++;
            }
            if(count >= mid){
                left = mid;
            }else{
                right = mid-1;
            }
        }
        return left;
}}
