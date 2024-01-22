// Write a program to find the power function using recursion.

public class PowerFunction {
    public static void main(String[] args){
    System.out.println(power(3,4));
    
  }
    public static int power (int x, int n)
    {
      if(n==0) return 1;
      return (power(x,n-1)*x);

      
    }
}

