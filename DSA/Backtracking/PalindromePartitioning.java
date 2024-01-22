// Given a string s, a partitioning of the string is a palindrome partitioning if every sub-string of the partition is a palindrome. Return all possible palindrome partitioning of s.

import java.util.*;
public class PalindromePartitioning {
    public static void main(String[] args) {
        String s ="abbaca";
        List<List<String>> ans = partition(s);
        for(List<String> result : ans){
            for( String ss : result){
                System.out.print(ss+" ");
            }
            System.out.println();
        }
    }

    

    public static List<List<String>> partition(String s){
        List<List<String>> ans = new ArrayList<>();
        helper(s,0,ans,new ArrayList<>());
        return ans;
    }



    public static void helper(String s,int index,List<List<String>> ans,List<String> cur){
        if(index == s.length()){
            List<String> copyCur = new ArrayList<>(cur);
            ans.add(copyCur);
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s, index, i)){
                cur.add(s.substring(index, i+1));
                helper(s, i+1, ans, cur);
                cur.remove(cur.size()-1);
            }
        }
    }



    public static boolean isPalindrome(String s,int l,int r){
        while(l<=r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
}
