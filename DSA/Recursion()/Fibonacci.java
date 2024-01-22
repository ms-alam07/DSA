// Write a Program to find the Fibonacci Number using Recusrion.

public class Fibonacci {
     

    static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-2)+fibo(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
}
