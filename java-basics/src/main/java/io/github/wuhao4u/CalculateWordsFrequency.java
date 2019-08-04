package io.github.wuhao4u;

import io.github.wuhao4u.utils.Printer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CalculateWordsFrequency {
    // Map and Set
//    Give a list of strings, calculate and print the frequency of each string based on alphabetical order.
//    Example1: input {“abc”, “bcd”, “abc”}, output “abc”|2, “bcd”|1
    public static Map<String, Integer> stringFrequency(List<String> input) {
        Map<String, Integer> result = new TreeMap<>();

        if (input == null || input.size() == 0) {
            return result;
        }

        for (String in : input) {
            if (result.containsKey(in)) {
                result.compute(in, (key, val) -> val + 1);
            } else {
                result.put(in, 1);
            }
        }
        return result;
    }

    public static Map<String, Integer> stringFrequency1(List<String> input) {
        Map<String, Integer> result = new TreeMap<>();

        if (input == null || input.size() == 0) {
            return result;
        }

        for (String in : input) {
            result.put(in, result.getOrDefault(in, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
//        List<String> l1 = Arrays.asList("abc", "bcd", "abc");
        List<String> l1 = Arrays.asList("yiersan", "abc", "bcd", "abc");
        Map<String, Integer> r1 =CalculateWordsFrequency.stringFrequency1(l1);
        System.out.println(Printer.convertWithStream(r1));
    }
}
