//Given an array nums[] of distinct integers, return all the possible permutations.Return the answer in sorted order. See the examples for more clarification.

import java.util.*;
public class GeneratePranthesis {

    public static void main(String[] args) {
        
        System.out.println(AllParenthesis( 3));
    }
    public static List <String> AllParenthesis(int n) {
        ArrayList <String> ans = new ArrayList <String>();      
        generate(n,"",0,0,0,ans);
        return ans;
      }
  
    
  public static void generate(int n,String cur,int i,int open,int close,ArrayList <String> ans){
      if(i==2*n){
        ans.add(cur);
        return;
      }
      if(open<n){
        cur = cur+'(';
        generate(n, cur,i+1,open+1,close,ans);
        cur= cur.substring(0,cur.length()-1);      
      }
      if(close<open){
        cur = cur+')';
        generate(n, cur,i+1,open,close+1,ans);
      }    
    }
    
}
