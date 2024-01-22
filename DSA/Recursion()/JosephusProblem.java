// Write a Program for Josephus Problem using Recusrion.

/*Given a total of n people and the number k, which means that k-1 people are skipped and the kth person is killed in a predetermined direction in a circle.
The count will begin at the k+1th individual after each operation.

The goal is to select a safe location within the circle so that, after performing these actions starting from the first position within the circle, you are the only one left alive.*/

public class JosephusProblem {
    public static void main(String[] args){
        System.out.println(josephus(5,3));
      }
       public static int josephus (int n, int k)
        {
    if (n == 1) return 0;
          return (josephus(n-1,k) +(k))%n;  
        }
}
