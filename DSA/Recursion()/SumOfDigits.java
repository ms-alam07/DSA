// Write a Java recursive method to find the sum of the digits of a given integer.

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }

    public static int  sumDigits(int n){
        if(n<10) return n;

        int lastDigit = n%10;
        int remainingDigit = n/10;
        return lastDigit + sumDigits(remainingDigit);
    }
    
}
