package main.Solution_4;


import java.util.*;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return solution4_1(nums1,nums2);

    }

    public double solution4_1(int[] nums1, int[] nums2){
        int size = nums1.length + nums2.length;
        int[] resultAry = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, resultAry, 0, nums1.length);
        System.arraycopy(nums2, 0, resultAry, nums1.length, nums2.length);

        Arrays.sort(resultAry);
        if(size %2 == 0) {
            int idx = (size/2)-1;
            return (resultAry[idx]+resultAry[idx+1])/(2.0D);

        } else {
            return resultAry[((size-1)/2)];
        }
    }
}