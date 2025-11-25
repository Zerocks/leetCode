package main.Solution_3;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        return getLongest(null,s).size();
    }
    private List<String> getLongest(List<String> preList, String s){
        if(preList == null){
            preList = new ArrayList<>();
        }
        if(s.isEmpty()){
            return preList;
        }
        String first = s.substring(0,1);

        if(!preList.contains(first)){
            preList.add(first);
        }
        List<String> nextList = getLongest(null, s.substring(1));
        return preList.size() > nextList.size() ? preList : nextList;
    }
}