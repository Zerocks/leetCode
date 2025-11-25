package main.Solution_22;

import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    
    List<String> rtnList = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        
        genParent(n,0,0,"");
        return rtnList;
    }
    
    void genParent(int n,int left , int right, String str){
        
        if(right==n){
            rtnList.add(str);
        }
        else{
            if(left < n){
                genParent(n,left+1,right,str+"(");
            }
            if(left>right){
                genParent(n,left,right+1,str+")");
            }
        }

    }
}