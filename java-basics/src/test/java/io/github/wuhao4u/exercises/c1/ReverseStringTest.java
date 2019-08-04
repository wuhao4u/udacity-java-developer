package io.github.wuhao4u.exercises.c1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseString() {
//    Example1: input: "Hello World!", return "!dlroW olleH"
//    Example2: input: “abcde”, return “edcba”
        String s1 = "Hello World!";
        String s2 = "abcde";

        assertEquals("!dlroW olleH", ReverseString.reverseString(s1));
        assertEquals("edcba", ReverseString.reverseString(s2));
    }
}