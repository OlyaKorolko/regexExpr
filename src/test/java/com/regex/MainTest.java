package com.regex;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class MainTest {
    @Test
    public void DecimalIPWithBreaks() {
        String[] input = {"463.000.24223.54.", "122.67.1.90"};

        List<String> expected = new ArrayList<>();
        expected.add(input[1]);
        List<String> real = new ArrayList<>();
        for (String s : input) {
            if (Main.checkIfValidIP(s)) {
                real.add(s);
            }
        }
        assertEquals(expected, real);
    }
    @Test
    public void DecimalIPWithoutBreaks() {
        String[] input = {"3221226219", "4294967297"};

        List<String> expected = new ArrayList<>();
        expected.add(input[0]);
        List<String> real = new ArrayList<>();
        for (String s : input) {
            if (Main.checkIfValidIP(s)) {
                real.add(s);
            }
        }
        assertEquals(expected, real);
    }
    @Test
    public void hexadecimalIPWithBreaks() {
        String[] input = {"0x222.0xfff.0x344354.0xxx43", "0xC0.0x00.0x02.0xEB"};

        List<String> expected = new ArrayList<>();
        expected.add(input[1]);
        List<String> real = new ArrayList<>();
        for (String s : input) {
            if (Main.checkIfValidIP(s)) {
                real.add(s);
            }
        }
        assertEquals(expected, real);
    }
    @Test
    public void hexadecimalIPWithoutBreaks() {
        String[] input = {"0x2220000011111", "0xC00002EB"};

        List<String> expected = new ArrayList<>();
        expected.add(input[1]);
        List<String> real = new ArrayList<>();
        for (String s : input) {
            if (Main.checkIfValidIP(s)) {
                real.add(s);
            }
        }
        assertEquals(expected, real);
    }
    @Test
    public void octalIPWithBreaks() {
        String[] input = {"0300.0000.0002.0353", "0444.011111.1.099"};

        List<String> expected = new ArrayList<>();
        expected.add(input[0]);
        List<String> real = new ArrayList<>();
        for (String s : input) {
            if (Main.checkIfValidIP(s)) {
                real.add(s);
            }
        }
        assertEquals(expected, real);
    }
    @Test
    public void octalIPWithoutBreaks() {
        String[] input = {"0834456", "030000001353"};

        List<String> expected = new ArrayList<>();
        expected.add(input[1]);
        List<String> real = new ArrayList<>();
        for (String s : input) {
            if (Main.checkIfValidIP(s)) {
                real.add(s);
            }
        }
        assertEquals(expected, real);
    }
}