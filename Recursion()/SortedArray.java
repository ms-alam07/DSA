//Check whether an array arr[] of size N is sorted in non-decreasing order. 

public class SortedArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(arraySortedOrNot(arr, 5));
    }
    public static boolean arraySortedOrNot(int []arr, int n){ 

        if (n == 1 || n == 0) return true;
            if (arr[n - 1] < arr[n - 2]) return false;
            return arraySortedOrNot(arr, n - 1);
        }
    
}
