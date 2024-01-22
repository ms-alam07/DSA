// Given an array nums[] of distinct integers, return all the possible permutations.Return the answer in sorted order. See the examples for more clarification.

import java.util.*;
public class PermutationOfArray {
    public static void main(String[] args) {
        int nums[] ={1,2,3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, nums.length - 1, ans);
        return ans;
    }


public static void helper(int nums[],int l,int r,List<List<Integer>> ans){    
      if (l == r) {
            List<Integer> result = new ArrayList<>();
            for(int i = 0; i < nums.length; i++) {
                result.add(nums[i]);
            }
            ans.add(result);
            return;
        }     
            for (int i=l;i<=r;i++) {
            swap(nums,i,l);
            helper(nums,l+1,r,ans);
            swap(nums,i,l);
        }
    }

    public static void swap(int nums[], int i, int j) {
         int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
   }
