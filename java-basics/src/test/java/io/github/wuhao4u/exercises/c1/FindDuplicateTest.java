package io.github.wuhao4u.exercises.c1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicateTest {

//    Example1: input: abcabc, return: 3
//    Example2: input: abcd, return: -1
    @org.junit.jupiter.api.Test
    void findDuplicate() {
        String s1 = "abcabc";
        String s2 = "abcd";

        assertEquals(3, FindDuplicate.findDuplicate(s1));
        assertEquals(-1, FindDuplicate.findDuplicate(s2));
    }
}