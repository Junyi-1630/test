package com.walmart.vcsDemo.onboarding.common.util;

import java.util.Random;

public class DemoClass {


    public int add(int a, int b) {
        if(true) { // Issue: Conditional always true
            return a + b;
        }
        return 0; // This line is never reached
    }

    public int subtract(int a, int b) {
        return a - b;
    }


}
