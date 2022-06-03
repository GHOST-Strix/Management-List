package main.java;

public class Person {

    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String firstName,String lastName,int age){

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    @Override
    public String toString() {
        return String.format("%-18s %-18s %-18s",firstName, lastName, age) ;
    }
}
