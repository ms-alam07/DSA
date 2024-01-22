// Given an array arr[] having N positive integers, you have to generate all different subsequences of the array. Return the answer in a Lexographically sorted order.Note: The array can contain duplicates.

import java.util.*;
public class SubsequenceOfArray {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ans = AllSubsets(ArrayList<Integer> nums);
        for(List<String> result : ans){
            for( String ss : result){
                System.out.print(ss+" ");
            }
            System.out.println();
        }
    }
    
    public static ArrayList<ArrayList<Integer>> AllSubsets(ArrayList<Integer> nums)
    {
    ArrayList<ArrayList<Integer>> ans=new  ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> curr=new ArrayList<Integer>();
    Collections.sort(nums);
    helper(nums,ans,0,curr);
    return ans;
    }
    static void helper(ArrayList<Integer> nums, ArrayList<ArrayList<Integer>> ans,int index,ArrayList<Integer> cur){
        ans.add(new ArrayList<>(cur));

      for(int i=index;i<nums.size();i++){
        if (i > index && nums.get(i) == nums.get(i - 1)) {
                continue;
            }
        cur.add(nums.get(i));
        helper(nums,ans,i+1,cur);
        cur.remove(cur.size()-1);
      }
    }

}