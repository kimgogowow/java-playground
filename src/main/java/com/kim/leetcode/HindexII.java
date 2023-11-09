package com.kim.leetcode;

public class HindexII {
    public int hIndex(int[] citations) {
        int left = 0;
        int right = citations.length-1;
        int res = 0;
        while(left<=right){
            //【1，4，4，6，8，9，9】 mid = 0+7/2=3,
            int mid = (left+right+1)/2;
            if(citations[mid] >=citations.length-mid){//6>=4?
                //6>3? index就是该论文大于的数量，但是求的是大于等id的
                //to left
                right = mid-1;

            }else{
                //to left
                left = mid+1;
            }
        }
        return citations.length - left;
    }
}
