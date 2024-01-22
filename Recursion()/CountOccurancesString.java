// Write a Program to find the Count Occurances of String using Recusrion.

public class CountOccurancesString {

    public static void main(String[] args) {
        System.out.println(CountOccurances("aba", "abacbbabacaba"));
    }

    static int CountOccurances(String t,String s){
        return CountOccurancesHelper(t, s, 0);
    }

    static int CountOccurancesHelper(String t,String s,int i){
        if(i>s.length()-t.length()) {
            return 0;
        }
        int subproblemSolution =CountOccurancesHelper(t, s, i+1);
        boolean startingcharmatch = s.substring(i, i+t.length()).equals(t);
        if(startingcharmatch) return subproblemSolution+1;
        return subproblemSolution;
    }
}
