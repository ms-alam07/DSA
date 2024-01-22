// Write a Java recursive method to find the sum of all odd numbers in an array.

public class OddNumber {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        System.out.println(OddNumber(a, 0));
        
    }
    public static int OddNumber(int a[],int i){
        if(i == a.length) return 0;
        int sum = OddNumber(a, i+1);

        if(a[i]%2 != 0){
            sum = sum+a[i];
        }
        return sum;

    }
    
}
