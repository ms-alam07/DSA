// Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).

public class ExponentPower {
    public static double ExponentPower(double base,int exponent){
        if(base ==1 || exponent==0) return 1;
        return base * ExponentPower(base, exponent-1);
    }

    public static void main(String[] args) {
        System.out.println(ExponentPower(3.5,4));
    }
    
}
