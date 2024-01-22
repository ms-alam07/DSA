// Write a program to rotate the array k times.

public class RotateByK{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        rotate(a, 3);
        print(a);
        
    }

    static void print(int a[]){
        for(int A:a){
            System.out.print(A +" ");
        }
    }

    static void rotate(int a[],int k){
        int n=a.length;
        for(int i=0;i<k;i++){
            int temp=a[0];
            for(int j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[n-1]=temp;
        }
    }

}