//Write a Java recursive method to count the number of occurrences of a specific element in an array.

public class CountOccurancesArray {

    public static void main(String[] args) {
        int a[]={10,20,30,30,20,40,20,50};
        System.out.println(CountOccurances(a));
    }


    public static int CountOccurances(int[] a){
         return helper(a, 20, 0);

    }

    public static int helper(int a[],int target, int i){
        if(i== a.length) return 0;
        
        int count = helper(a, target, i+1);
        if (a[i]==(target)) {
            count++;
          }
          return count;
    }
    
}
