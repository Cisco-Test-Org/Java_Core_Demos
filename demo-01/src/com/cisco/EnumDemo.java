package com.cisco;

public class EnumDemo {
    public static void main(String[] args) {

        System.out.println(Weekdays.MONDAY);

        /** traversing enums **/

        Weekdays[] weekdays = Weekdays.values();
        for (Weekdays weekday : weekdays) {
            System.out.println(weekday);
        }
    }
}

enum Weekdays{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}


/**
 * Enumerations were added to Java language in JDK5.
 * Enumeration means a list of named constant. In Java, enumeration defines a class type.
 * An Enumeration can have constructors, methods and instance variables.
 * It is created using enum keyword.
 * Each enumeration constant is public, static and final by default.
 * Even though enumeration defines a class type and have constructors, you do not instantiate an enum using new.
 * Enumeration variables are used and declared in much a same way as you do a primitive variable.
 */