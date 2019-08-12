package io.github.wuhao4u.exercises.c1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TranslateNumberToWordTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void translateNumberToWord() {
        assertEquals("ten thousand two hundred forty five",
                TranslateNumberToWord.translateNumberToWord(10245));
        assertEquals("one hundred twenty five", TranslateNumberToWord.translateNumberToWord(125));
        assertEquals("negative one hundred twenty five", TranslateNumberToWord.translateNumberToWord(-125));
        assertEquals("zero", TranslateNumberToWord.translateNumberToWord(0));

        assertEquals("one hundred", TranslateNumberToWord.translateNumberToWord(100));
        assertEquals("nine hundred ninety nine", TranslateNumberToWord.translateNumberToWord(999));

        assertEquals("twenty two", TranslateNumberToWord.translateNumberToWord(22));
        assertEquals("forty two", TranslateNumberToWord.translateNumberToWord(42));

        assertEquals("nine hundred twenty six", TranslateNumberToWord.translateNumberToWord(926));
        assertEquals("one hundred eight", TranslateNumberToWord.translateNumberToWord(108));
        assertEquals("five hundred", TranslateNumberToWord.translateNumberToWord(500));


        assertEquals("one hundred", TranslateNumberToWord.translateNumberToWord(100));

        assertEquals("ninety nine", TranslateNumberToWord.translateNumberToWord(99));
        assertEquals("ten", TranslateNumberToWord.translateNumberToWord(10));
        assertEquals("sixty four", TranslateNumberToWord.translateNumberToWord(64));
        assertEquals("fourteen", TranslateNumberToWord.translateNumberToWord(14));
        assertEquals("twenty one", TranslateNumberToWord.translateNumberToWord(21));

        assertEquals("one", TranslateNumberToWord.translateNumberToWord(1));
        assertEquals("two", TranslateNumberToWord.translateNumberToWord(2));
        assertEquals("three", TranslateNumberToWord.translateNumberToWord(3));
        assertEquals("four", TranslateNumberToWord.translateNumberToWord(4));
        assertEquals("five", TranslateNumberToWord.translateNumberToWord(5));
        assertEquals("six", TranslateNumberToWord.translateNumberToWord(6));
        assertEquals("seven", TranslateNumberToWord.translateNumberToWord(7));
        assertEquals("eight", TranslateNumberToWord.translateNumberToWord(8));
        assertEquals("nine", TranslateNumberToWord.translateNumberToWord(9)); 
    }

    @Test
    void threeDigitsNumberToWord() {
        assertEquals("one hundred", TranslateNumberToWord.threeDigitsNumberToWord(100));
        assertEquals("nine hundred ninety nine", TranslateNumberToWord.threeDigitsNumberToWord(999));

        assertEquals("twenty two", TranslateNumberToWord.threeDigitsNumberToWord(22));
        assertEquals("forty two", TranslateNumberToWord.threeDigitsNumberToWord(42));

        assertEquals("nine hundred twenty six", TranslateNumberToWord.threeDigitsNumberToWord(926));
        assertEquals("one hundred eight", TranslateNumberToWord.threeDigitsNumberToWord(108));
        assertEquals("five hundred", TranslateNumberToWord.threeDigitsNumberToWord(500));
    }

    @Test
    void twoDigitsNumberToWord() {
        assertEquals("", TranslateNumberToWord.twoDigitsNumberToWord(0));
        assertEquals("one hundred", TranslateNumberToWord.twoDigitsNumberToWord(100));

        assertEquals("ninety nine", TranslateNumberToWord.twoDigitsNumberToWord(99));
        assertEquals("ten", TranslateNumberToWord.twoDigitsNumberToWord(10));
        assertEquals("sixty four", TranslateNumberToWord.twoDigitsNumberToWord(64));
        assertEquals("fourteen", TranslateNumberToWord.twoDigitsNumberToWord(14));
        assertEquals("twenty one", TranslateNumberToWord.twoDigitsNumberToWord(21));
    }

    @Test
    void oneDigitNumberToWord() {
        assertEquals("", TranslateNumberToWord.oneDigitNumberToWord(0));
        assertEquals("one", TranslateNumberToWord.oneDigitNumberToWord(1));
        assertEquals("two", TranslateNumberToWord.oneDigitNumberToWord(2));
        assertEquals("three", TranslateNumberToWord.oneDigitNumberToWord(3));
        assertEquals("four", TranslateNumberToWord.oneDigitNumberToWord(4));
        assertEquals("five", TranslateNumberToWord.oneDigitNumberToWord(5));
        assertEquals("six", TranslateNumberToWord.oneDigitNumberToWord(6));
        assertEquals("seven", TranslateNumberToWord.oneDigitNumberToWord(7));
        assertEquals("eight", TranslateNumberToWord.oneDigitNumberToWord(8));
        assertEquals("nine", TranslateNumberToWord.oneDigitNumberToWord(9));
    }
}