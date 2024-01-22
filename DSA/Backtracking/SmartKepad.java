// You are given a string digits that contains digits from [2 - 9], both inclusive. Return all possible letter combinations that the number could represent in sorted order. 

import java.util.*;
public class SmartKepad {

    public static void main(String[] args) {
        String digits ="23";
        List<String> ans = letterCombinations(digits);
        for(String s:ans){
            System.out.println(s);
        }
        }

    public static List<String> letterCombinations(String digits) {
        String a[] = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        List<String> ans = new ArrayList<>();
        helper(digits, a, 0, ans, "");
        return ans;
    }

    public static void helper(String digits, String a[], int index, List<String> ans, String cur) {
        if (index == digits.length()) {
            ans.add(cur);
            return;
        }
        int indexOfButton = digits.charAt(index) - '0';
        String buttonString = a[indexOfButton];

        for (int i = 0; i < buttonString.length(); i++) {
            helper(digits, a, index + 1, ans, cur + buttonString.charAt(i)); // Fix here
        }
    }
    }