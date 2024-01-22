// Write a Java recursive method to calculate the product of all numbers in an array.

public class ProductOfArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        System.out.println(productOfArrayElements(a, 0));
        
    }
    
    public static int productOfArrayElements(int a[],int i){
        if(i==a.length) return 1;
        return productOfArrayElements(a, i+1)*a[i];
    }
}
