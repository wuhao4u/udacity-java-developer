package io.github.wuhao4u;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsTest {

    @Test
    void list() {
    }

    @Test
    void linkedList() {
    }

    @Test
    void groupString() {
        List<String> l1 = new ArrayList<>();
//        {"bcd", "abc", "cde"}
        l1.add("bcd");
        l1.add("abc");
        l1.add("cde");

        List<String>[] l1Res = Collections.groupString(l1);

        assertEquals("abc", l1Res[0].get(0));
        assertEquals("bcd", l1Res[1].get(0));
        assertEquals("cde", l1Res[2].get(0));

//        {“abc”, “bcd”, “bbb”, “ace”, “snb”, “aaaa”, “bbbbb”, “eeee”}
        List<String> l2 = new ArrayList<>();
        l2.add("abc");
        l2.add("bcd");
        l2.add("bbb");
        l2.add("ace");
        l2.add("snb");
        l2.add("aaaa");
        l2.add("bbbbb");
        l2.add("eeee");

        List<String>[] l2Res = Collections.groupString(l2);

        assertEquals(3, l2Res[0].size());
        assertEquals(3, l2Res[1].size());
        assertEquals(2, l2Res[2].size());
    }

    @Test
    void calculate() {
        String input1 = "1+2";
        String input2 = "1+2*5";

//        assertEquals(3, Collections.calculate(input1));
        assertEquals(11, Collections.calculate(input2));
    }

    @Test
    void main() {
    }
}