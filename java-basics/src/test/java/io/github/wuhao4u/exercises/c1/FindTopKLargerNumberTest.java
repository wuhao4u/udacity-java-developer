package io.github.wuhao4u.exercises.c1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindTopKLargerNumberTest {

    @Test
    void findTopKLargerNumber() {
//    Example 1: [-1, 15, 59, 22, 6, 42, 45, 0], k=4, return {22, 42, 45, 59}
//    Example 2: [5, 10, 22, 100, 8], k=2, return {22, 100}
        Integer[] a1 = {-1, 15, 59, 22, 6, 42, 45, 0};
        Integer[] a2 = {5, 10, 22, 100, 8};

        List res1 = FindTopKLargerNumber.findTopKLargerNumber(a1, 4);
        List res2 = FindTopKLargerNumber.findTopKLargerNumber(a2, 2);
    }
}