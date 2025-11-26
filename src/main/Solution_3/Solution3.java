package main.Solution_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        return getLongestV3(s);
    }


    private int getLongestV3(String s){
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int leftIdx = 0;
        char[] charArray = s.toCharArray();
        for (int x=0;x<charArray.length;x++) {
            char c = charArray[x];

            if(map.containsKey(c) && map.get(c) >= leftIdx){
                leftIdx = map.get(c)+1;
            }
            map.put(c,x);

            result = Math.max(result,x-leftIdx+1);
        }
        return result;
    }



    private int getLongestV2(String s){
        char[] charArray = s.toCharArray();
        List<Character> list = new ArrayList<>();
        int result = 0;
        for (char c : charArray) {
            if (list.contains(c)) {
                list = list.subList(list.indexOf(c)+1,list.size());
            }
            list.add(c);
            result = Math.max(list.size(), result);
        }
        return result;
    }

    private List<String> getLongest(List<String> preList, List<String> longest, String s){

        if(s.isEmpty()){
            return preList;
        }
        String first = s.substring(0,1);

        if(preList.contains(first)){
            preList = preList.subList(preList.indexOf(first)+1,preList.size());
        }
        preList.add(first);

        if(longest.size()<preList.size()){
            longest = List.copyOf(preList);
        }
        List<String> nextList = getLongest(preList, longest, s.substring(1));
        return longest.size() > nextList.size() ? longest : nextList;
    }


/*    private int getLongestSize(Integer preIndex, Integer longestSize, String s){
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
        result = Math.max(result, preList.size());

        List<String> nextList = getLongest(preList, longest, s.substring(1));
        return longest.size() > nextList.size() ? longest : nextList;
        return 0;
    }*/
}