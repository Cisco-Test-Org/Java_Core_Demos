package com.cisco;

public class Intro {
    public static void main(String[] args) {



        String s1 = "apple";
        String s2 = "orange";
        String s3 = "apple";
        String s4 = "Apple";
        String s5 = "Today is a good day to code";
        String s6 = "a good day";
        String s7 = "apple";

        /** compareTo() **/

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));

        /** charAt() **/

        System.out.println(s1.charAt(0));

        /** equalsIgnoreCase() **/

        System.out.println(s1.equalsIgnoreCase(s4));

        /** contains() **/

        System.out.println(s5.contains(s6));

        /** endsWith() **/

        System.out.println(s5.endsWith("to code"));

        /** startsWith() **/

        System.out.println(s6.startsWith("a go"));

        /** replace() **/

        System.out.println(s7.replace("p", "*"));

        /** substring() **/

        System.out.println(s7.substring(1,3));


    }
}
