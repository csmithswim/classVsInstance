package com.csmithswim;
import java.io.*;
import java.util.*;
public class Person {
    private int age;

    public Person(int initialAge) {



        // Add some more code to run some checks on initialAge

        if (initialAge <= 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            age = initialAge;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if (age < 13) {
            System.out.print("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.print("You are a teenager.");
        } else {
            System.out.print("You are old.");
        }
        System.out.println(/*Insert correct print statement here*/);
    }

    public void yearPasses() {
        // Increment this person's age.
        age++;
    }
}
/*
    4
    -1
    10
    16
    18
    Age is not valid, setting age to 0.
    You are young.
    You are young.
    You are young.
    You are a teenager.
    You are a teenager.
    You are old.
    You are old.
    You are old.
 */