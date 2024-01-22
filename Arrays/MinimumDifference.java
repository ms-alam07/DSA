// Given an array of distinct integers, find all pairs of elements where the difference between the two elements is the smallest among all pairs in the array. Return these pairs in ascending order, where each pair is represented by [a, b], such that a, b are elements from the array and a < b. The difference between a and b should be the smallest possible.

import java.util.*;
public class MinimumDifference {

    public static void main(String[] args) {
        int a []= {12,9,8,11,2};
        List<List<Integer>> ans  = minimum(a);

         for(List<Integer> e: ans){
            System.out.print(e);
            System.out.println();
         }
    }
    
    public static List<List<Integer>> minimum(int a[]){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);
        int n = a.length;
        int mimDiff = Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            if(a[i]-a[i-1]<mimDiff){
                mimDiff = a[i]-a[i-1];
            }
        }
        for(int i=1;i<n;i++){
            if(a[i]-a[i-1]== mimDiff){
                List<Integer> temp = new ArrayList<>();
                temp.add(a[i-1]);
                temp.add(a[i]);
                ans.add(temp);
            }
        }
        return ans;
        }
}