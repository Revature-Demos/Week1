package com.revature;

public class LauncherPrimitives {
    public static void main(String[] args) {
        // int is the most common integer type primitive (others include byte and short)
        int i = 10;
        int i2 = 1000000; // good manners to use underscores where a comma should be

        // what if we need a really big number? we can use a long
        long l = 1000000000000L; // note the "L" at the end, which makes it a long

        // booleans are how we can convey true/false in java
        boolean b = true;
        boolean b2 = false;

        // booleans are also sometimes the result of expressions
        System.out.println(10 > 5); // true
        System.out.println(5 > 7); // false

        // chars are just single 'char'acters. They use 'single quotes'
        char c = 'c';
        // we can also use unicode values to get a char;
        char c2 = '\u00A9'; // This is the unicode value for the copyright symbol
        System.out.println("Revature" + c2);

        // double is the most commonly used decimal-type primitive
        double d = 10.5;

        System.out.println("==========================================(Arithmatic Operators)");

        // we know how -, *, / work, and they don't do anything crazy in Java

        // + does have a few things to consider

        // int + int = int
        System.out.println(10 + 5); // 15
        //String + String = StringString
        System.out.println("Hola" + " Mundo"); // Hola Mundo
        //String + int = Stringint
        System.out.println("The number is " + 10); // The number is 10

        // % is the 'modulus' operator, which returns the remainder of a division
        int num1 = 10;
        int num2 = 11;

        System.out.println(num2 % num1); // 1. 11 / 10 has a remainder of 1

        // we can use modulus to determine even or odd - common entry-level interview question
        if (num1 % 2 == 0) {
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }
        // If the number divided by 2 has no remainder, we know it's even!

        /* increment/decrement operators

        we can use ++ to increase a number by 1
        we can use -- to decrease a number by 1
        very useful in loops, or any kind of up/down counter

        we can use these on any numerical type    */
        int funnyNumber = 24;
        System.out.println(funnyNumber);
        funnyNumber++;
        System.out.println(funnyNumber);

        System.out.println(funnyNumber--);
        // WHY is this number still 25?
        // Well, since the -- is after the variable, the decrement happens after the println
        System.out.println(funnyNumber);
        // If you need to avoid this, then you should increment/decrement before the variable
        System.out.println(++funnyNumber);
    }
}
