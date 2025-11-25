package main.Solution_164;

import java.util.Arrays;

public class Solution164 {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxDif = 0;
        for(int x=0;x<nums.length-1;x++){
            maxDif=Math.max(maxDif,nums[x+1]-nums[x]);
        }
        
        return maxDif;
    }
}