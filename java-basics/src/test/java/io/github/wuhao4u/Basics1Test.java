package io.github.wuhao4u;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Basics1Test {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void longToUTC() {
    }

    @org.junit.jupiter.api.Test
    void stringBuilder() {
    }

    @org.junit.jupiter.api.Test
    void vowelOnly() {
    }

    @org.junit.jupiter.api.Test
    void findTarget() {
        //    Input: [1, 5, 7, 8, 9, 11, 18, 19, 20, 25], target=11, output=5.
        //    Input: [1, 2, 3, 4, 5], target=10, output=-1
        int[] a1 = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};
        assertEquals(5, Basics1.findTarget(a1, 11));
        assertEquals(0, Basics1.findTarget(a1, 1));
        assertEquals(9, Basics1.findTarget(a1, 25));

        int[] a2 = {1, 2, 3, 4, 5};
        assertEquals(-1, Basics1.findTarget(a2, -1));
    }


    @Test
    void printPermutn() {
//    Input: [1, 2], print 12, 21
//    Input: [1, 2, 3], print 123, 132, 213, 231, 312, 321.
        printPermutn();
    }
}