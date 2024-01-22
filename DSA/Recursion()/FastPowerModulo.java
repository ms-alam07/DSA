// Write a program to find the power with modulo using recursion.

public class FastPowerModulo {
    public static void main(String[] args){
  System.out.println(myPow(7,7,30));
}
  
    public static double myPow (double x, int n, int p) {

    if(n==0) return 1;
      if(n<0) return myPow(1/x,Math.abs(n),p);

      if(n%2==0) {
        return myPow(x%p*x%p,n/2,p)%p;
      }
      else{
        return (x%p*(myPow(x,n-1,p))%p)%p;
      }
    }
}

