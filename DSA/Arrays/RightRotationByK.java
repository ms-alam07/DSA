// Write a java program to right rotate the fiven array.

public class RightRotationByK {

    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6,7};
        rotate(a, 3);

        for(int e:a){
            System.out.print(e);
        }
    }

    public static void reverse(int a[],int l, int r){
        while(l<r){
            int temp = a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
    }

    public static void rotate(int a[],int k){
        int n = a.length;
        if(k>n){
            k =k%n;
        }
        reverse(a, 0, n-1);
        reverse(a, 0, k-1);
        reverse(a, k, n-1);
    }
}