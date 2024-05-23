package com.ets;

public class TrappingRain {
    public int trapping(int [] height) {
        if(height.length == 0) {
            return 0;
        }

        int result = 0;
        int leftPointer = 0;
        int leftMax = height[leftPointer];
        int rightPointer = height.length-1;
        int rightMax = height[rightPointer];

        while(leftPointer < rightPointer) {
            if(leftMax < rightMax) {
                leftPointer ++;
                leftMax = Math.max(leftMax, height[leftPointer]);
                int temp = Math.max(height[leftPointer], 0);
                result += leftMax - temp;
            } else {
                rightPointer --;
                rightMax = Math.max(rightMax, height[rightPointer]);
                int temp = Math.max(height[rightPointer], 0);
                result += rightMax - temp;
            }
        }
        return result;
    }
}
