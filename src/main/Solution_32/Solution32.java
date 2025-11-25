package main.Solution_32;

import java.util.Stack;

public class Solution32 {
    public int longestValidParentheses(String s) {
        int count = 0;
        int maxCount = 0;
        Stack<String> stk = new Stack<String>();
        Stack<Integer> intStk = new Stack<Integer>();
        stk.push("0");
        for(int x = 0;x<s.length();x++){
            String letter = Character.toString(s.charAt(x));
            
            if("(".equals(letter)){
                stk.push(letter);
                intStk.push(count);
                count = 0;
            }
            else if(")".equals(letter)){
                if("(".equals(stk.peek())){
                    stk.pop();
                    count+=1+intStk.pop();
                    if(maxCount<count){
                        maxCount = count;
                    }
                }
                else{
                    // not paired
                    count = 0;
                }
            }
            else{
                count = 0;
            }
        }
        return maxCount*2;
    }
}