package io.github.wuhao4u.exercises.c1;

public class FindDuplicate {
    /*
    Write a method. Give a string, find the first duplicate character, return the index.
    If there is no duplicate character, return -1.
    Example1: input: abcabc, return: 3
    Example2: input: abcd, return: -1
     */

    public static int findDuplicate(String input) {
        if (input == null || input.length() == 0) {
            return -1;
        }

        char[] inputArray = input.toCharArray();
        boolean[] showed = new boolean[256];

        for (int i = 0; i < inputArray.length; ++i) {
            int asciiNum = (int) inputArray[i];
            if (showed[asciiNum]) {
                return i;
            } else {
                showed[asciiNum] = true;
            }
        }

        return -1;
    }

   public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', '\t'};

        for (int i = 0; i < chars.length; ++i) {
            System.out.println((int) chars[i]);
        }
    }
}
