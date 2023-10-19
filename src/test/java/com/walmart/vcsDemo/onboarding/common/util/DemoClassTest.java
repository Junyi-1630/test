package com.walmart.vcsDemo.onboarding.common.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoClassTest {

    private DemoClass demoClass;

    @BeforeEach
    public void setUp() {
        demoClass = new DemoClass();
    }
    @Test
    public void testAdd() {
        assertEquals(5, demoClass.add(2, 3), "Expected 2 + 3 to be 5");
        assertEquals(0, demoClass.add(0, 0), "Expected 0 + 0 to be 0");
        assertEquals(-3, demoClass.add(-1, -2), "Expected -1 + -2 to be -3");
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, demoClass.subtract(2, 3), "Expected 2 - 3 to be -1");
        assertEquals(0, demoClass.subtract(0, 0), "Expected 0 - 0 to be 0");
        assertEquals(1, demoClass.subtract(-2, -3), "Expected -2 - -3 to be 1");
    }
}