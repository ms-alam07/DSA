// Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.Find the rotated array for each value and return the result in a matrix where the ith row represents the rotated array for the ith value in B.After every rotation, array A becomes equal to the original. 

public class MultipleRotation {

    public static void main(String[] args) {
        int a [] ={1,2,3,4,5};
        int b [] ={2,3};

        int ans [][] = multipleRotate(a, b);

        for(int e[]: ans){
            Print(e);
            System.out.println();
        }
    }

    public static void Print(int a[]){
        for(int e:a){
            System.out.print(e);
        }
    }

    public static int [][] multipleRotate(int a[],int b[]){
        int n = a.length;
        int m = b.length;
        int ans[][] = new int [m][n];
        int temp [] = new int  [2*n];

        for(int i=0;i<n;i++){ // Making a  new temp array and initializing the value of array A.
            temp[i]=a[i];
            temp [i+n] = a[i];
        }
        for(int i=0;i<m;i++){
            int offset =(b[i]%n);
            for(int j=0;j<n;j++){
                ans[i][j] = temp[j+offset];
            }
        }
        return ans;
    }
    
}
