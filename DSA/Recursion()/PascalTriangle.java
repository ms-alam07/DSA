// Write a Program to find the Pascal Triangle using Recusrion.

public class PascalTriangle {

    static int Pascal(int n, int r){
        if(n==r || r==0) return 1;
        return Pascal(n-1,r-1)+ Pascal(n-1,r);
    } 

    public static void main(String[] args) {
        System.out.println(Pascal(5,2));
    }
}
