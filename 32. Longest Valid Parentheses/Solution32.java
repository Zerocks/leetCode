public class Solution {
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
                    if(maxCount<count){
                        maxCount = count;
                    }
                    count = 0;
                }
            }
            else{
                if(maxCount<count){
                    maxCount = count;
                }
                count = 0;
            }
        }
        return maxCount*2;
    }
}