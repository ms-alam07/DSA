// Write a recursive function ot find the sum on N Natural Numbers.

import java.lang.*;
import java.util.*;
public class SumNaturalNo {

    public static int sumOf(int n){
        if(n==1) return 1;
        return sumOf(n-1)+n;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOf(n));
    }
    
}
