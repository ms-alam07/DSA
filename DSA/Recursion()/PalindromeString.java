// Write a Program to find whether the given String is Palindrome or not using Recusrion.

public class PalindromeString{

  public static void main(String[] args) {
    String s ="madam";
    boolean ans = helper(s, 0, s.length()-1);
    System.out.println(ans);
  }

  public static boolean helper (String str, int l, int r){
    if(l>=r) return true;
    if(str.charAt(l) == str.charAt(r)) {
      return helper(str,l+1,r-1);
    }
    else return false;
  }
  
}