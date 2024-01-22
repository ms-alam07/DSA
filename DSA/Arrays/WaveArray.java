// Given an array of integers A, sort the array into a wave-like array and return it. Arrange the elements into a sequence such that -(a1 >= a2 <= a3 >= a4 <= a5.....)

import java.util.*;
public class WaveArray {

    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(1);
        input.add(5);
        input.add(4);
        input.add(3);

        ArrayList<Integer> ans = wave(input);
        System.out.println(ans);
        }

    public static ArrayList<Integer> wave(ArrayList<Integer> a){
        Collections.sort(a); // for making it in lexographically order sort the array firsts
        for(int i=1;i<a.size();i+=2){ // Go to odd position and swap the element before it.
            swap(a, i, i-1);
        }
        return a;
    }

    public static void swap(ArrayList<Integer> a,int i,int j){
        int temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j,temp);
    }
}