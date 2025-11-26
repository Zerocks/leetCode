package main.Solution_3;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        return getLongest(null,null,s).size();
    }
    private List<String> getLongest(List<String> preList, List<String> longest, String s){
        if(preList == null){
            preList = new ArrayList<>();
        }
        if(s.isEmpty()){
            return preList;
        }
        String first = s.substring(0,1);

        if(preList.contains(first)){
            preList = preList.subList(preList.indexOf(first)+1,preList.size());
        }
        preList.add(first);
        if(longest==null){
            longest = new ArrayList<>();
        }
        if(longest.size()<preList.size()){
            longest = List.copyOf(preList);
        }
        List<String> nextList = getLongest(preList, longest, s.substring(1));
        return longest.size() > nextList.size() ? longest : nextList;
    }
    private int getLongestSize(Integer preIndex, Integer logestSize, String s){

        return 0;
    }
}