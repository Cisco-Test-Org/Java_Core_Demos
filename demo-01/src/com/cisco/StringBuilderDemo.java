package com.cisco;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("Hello");
        s1.append(" World");
        System.out.println(s1);

    }
}


/**
 * StringBuilder is identical to StringBuffer except for one important difference that it is not synchronized,
 * which means it is not thread safe.
 *
 * StringBuilder also used for creating string object that is mutable and non synchronized.
 * The StringBuilder class provides no guarantee of synchronization.
 * StringBuffer and StringBuilder both are mutable but if synchronization is not required then it is recommended
 * to use StringBuilder class.
 */