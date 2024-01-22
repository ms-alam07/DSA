// Write a Java recursive method to find the length of a given string.

public class StringLength {
    public static int stringLength(String s){
        if(s.isEmpty() || s.length()==0) return 0;
        return 1 + stringLength(s.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(stringLength("helloworld"));
    }
}
