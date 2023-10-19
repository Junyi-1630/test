package com.walmart.vcsDemo.onboarding.common.util;

import java.util.Random;

public class DemoClass {

    private String password = "password123"; // Issue: Hardcoded password

    public int add(int a, int b) {
        if(true) { // Issue: Conditional always true
            return a + b;
        }
        return 0; // This line is never reached
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public void insecureRandomNumber() {
        Random rand = new Random(); // Issue: Using java.util.Random for generating secure data
        int randomNum = rand.nextInt(100);
        System.out.println(randomNum);
    }

    public void duplicateMethod() { // Issue: Duplicated code
        for(int i=0; i<10; i++) {
            System.out.println(i);
        }
    }

    public void anotherDuplicateMethod() { // Issue: Duplicated code
        for(int i=0; i<10; i++) {
            System.out.println(i);
        }
    }
}
