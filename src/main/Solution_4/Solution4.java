package main.Solution_4;


import java.util.*;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return solution4_v2(nums1,nums2);

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

    public double solution4_v2(int[] nums1, int[] nums2){
        int size = nums1.length + nums2.length;

        int idx1 = 0;
        int idx2 = 0;
        int targetIdx = (size/2);
        int currInt;
        int lastInt = 0;
        for(int x=0;x<size;x++){
            if(idx1>=nums1.length){
                currInt = nums2[idx2];
                idx2++;
            } else if (idx2>=nums2.length){
                currInt = nums1[idx1];
                idx1++;

            } else if (nums1[idx1]<=nums2[idx2]){
                currInt = nums1[idx1];
                idx1++;

            } else {
                currInt = nums2[idx2];
                idx2++;

            }
            if(x>=targetIdx){
                if(size %2 == 0) {
                    return (lastInt+currInt)/2.0D;
                }else {
                    return currInt;
                }
            }
            lastInt = currInt;
        }


        return 0;
    }
}