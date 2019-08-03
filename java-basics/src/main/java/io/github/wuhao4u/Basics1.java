package io.github.wuhao4u;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basics1 {
    static void longToUTC() {
        Date utc = new Date(1561554154352L);
        System.out.println(utc.toString());
    }

    static void stringBuilder() {
        StringBuilder sb = new StringBuilder("Good Morning");
        sb.insert(1, "Friend ");
        System.out.println(sb.toString());
    }

    //        Input: “Hello World!” -> output: “eoo”
    //        Input: “Udacity Course” -> output: “Uaioue”
    public static String vowelOnly(String input) {
        return input.replaceAll("[^aeiouAEIOU]", "");
    }

    //    Input: [1, 5, 7, 8, 9, 11, 18, 19, 20, 25], target=11, output=5.
    //    Input: [1, 2, 3, 4, 5], target=10, output=-1
    public static int findTarget(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        int mid;

        while (left < right) {
            mid = left + (right - left) / 2;

            if (target < arr[mid]) {
                // in right side
                right = mid - 1;
            } else if (target > arr[mid]) {
                // in left side
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    //    Input: [1, 2], print 12, 21
    //    Input: [1, 2, 3], print 123, 132, 213, 231, 312, 321.
    public static void printPermutn(int[] arr, int index) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int length = arr.length;
        boolean[] used = new boolean[length];
        StringBuffer out = new StringBuffer();

        doPermute(arr, out, used, length, 0);
    }

    private static void doPermute(int[] in, StringBuffer out,
                                  boolean[] used, int length, int level) {
        if (level == length) {
            System.out.println(out.toString());
        }

        for (int i = 0; i < length; ++i) {
            if (used[i]) continue;

            out.append(in[i]);
            used[i] = true;
            doPermute(in, out, used, length, level + 1);
            used[i] = false;
            out.setLength(out.length() - 1);
        }
    }

    public static void main(String[] args) {
//        stringBuilder();
//        System.out.println(vowelOnly("Hello World!"));
//        System.out.println(vowelOnly("Udacity Course"));

//        int[] a1 = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};
//        int res = findTarget(a1, 11);
//        System.out.println(res);
//        System.out.println(a1.length);

        //    Input: [1, 2], print 12, 21
        //    Input: [1, 2, 3], print 123, 132, 213, 231, 312, 321.
        int[] a1 = {1, 2};
        int[] a2 = {1, 2, 3};
        printPermutn(a1, 0);
        printPermutn(a2, 0);
    }
}
