package com.cisco;

public class StringBufferDemo {
    public static void main(String[] args) {

        String s1 = "Hello";
        s1.concat(" World");
        System.out.println(s1);

        StringBuffer s2 = new StringBuffer("Hello");

        /** append() **/

        s2.append(" World");
        System.out.println(s2);

        /** reverse() **/

        System.out.println(s2.reverse());

        StringBuffer s3 = new StringBuffer("Java is awesome");

        /** replace() **/

        s3.replace(0,4, "Golang");
        System.out.println(s3);

    }
}

/**
 * It is similar to String class in Java both are used to create string.
 * StringBuffer class is used to create a mutable string object.
 * It means, it can be changed after it is created. It represents growable and writable character sequence.
 * So StringBuffer class is used when we have to make lots of modifications to our string.
 * It is also thread safe. Multiple threads cannot access it simultaneously
 */