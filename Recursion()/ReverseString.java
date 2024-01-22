//Write a Java recursive method to reverse a given string.

public class ReverseString {
    public static String reverse(String s){
        if(s.isEmpty()|| s.length()==1) return s;
        return reverse(s.substring(1))+s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("abcd"));
    }
}
