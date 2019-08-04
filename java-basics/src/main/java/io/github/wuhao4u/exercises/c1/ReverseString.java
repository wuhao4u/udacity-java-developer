package io.github.wuhao4u.exercises.c1;

public class ReverseString {
//    Write a function that takes a string as input and returns the string reversed.
//    Example1: input: "Hello World!", return "!dlroW olleH"
//    Example2: input: “abcde”, return “edcba”
    public static String reverseString(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        char[] sArray = s.toCharArray();
        int l = 0, r = sArray.length - 1;

        while (l < r) {
            char temp = sArray[l];
            sArray[l] = sArray[r];
            sArray[r] = temp;
            ++l;
            --r;
        }

        return new String(sArray);
    }
}
