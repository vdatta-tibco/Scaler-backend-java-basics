package com.scaler;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello there!");
        Person P1 = Person.builder().age(35).Name("Tiku").build();
        System.out.println("The name of the first person is " + P1.getName() + " and the age is " + P1.getAge());
    }
}
