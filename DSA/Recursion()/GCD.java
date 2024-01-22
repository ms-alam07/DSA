// Write a Java recursive method to find the greatest common divisor (GCD) of two numbers.

public class GCD {
    public static void main(String[] args) {
        System.out.println(GCD(48,36));
    }

    public static int GCD(int a, int b){
        if(b==0) return a;
        return GCD(b,a%b);
    }
}
