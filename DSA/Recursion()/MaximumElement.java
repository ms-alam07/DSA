// Write a Java recursive method to find the maximum element in an array.

public class MaximumElement {

    public static void main(String[] args) {
        int []a ={10,5,6,80,56,101};
        System.out.println(maximum(a, 0, a[0]));
    }
    public static int maximum(int a[],int i,int maxSoFar){
        if(i == a.length) return maxSoFar;
        maxSoFar = Math.max(a[i], maxSoFar);
        return maximum(a, i+1, maxSoFar);
    }
    
}
