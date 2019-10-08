package com.sethkraut.literate.word;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for WordsTest
 */
public class WordsTest {
    @Test
    public void name() {
        assertTrue(Words.endingWIth("l").test("All"));
    }
}