package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void sumSmallNumbers() {
        int expected = 12;
        assertEquals(expected, Calculator.sum(1,1));
    }


}