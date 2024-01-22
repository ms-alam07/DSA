// Write a Program to find the Subset(Subsequence)of a given String using Recusrion.

import java.util.*;
public class SubsetOfString {

    public static void main(String[] args) {
        String s="abc";
        System.out.println(findSubstrings(s));
    }

    public static List<String> findSubstrings(String s) {
        List<String> ans = new ArrayList<>();
        helper(s,"",0,ans);
        Collections.sort(ans);
        return ans;            
    }

    public static void helper(String s,String curr,int i,List<String>ans) {
        int n=s.length();
        if(i==n){
            if (!curr.equals("")) {
               ans.add(curr);
            }
            return;            
        }
        helper(s,curr+s.charAt(i),i+1,ans);
        helper(s,curr,i+1,ans);            
    }    
}

