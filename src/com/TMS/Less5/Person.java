package com.TMS.Less5;

public class Person {

    private String name;
    private String Lastname;


    public Person(String name, String lastname) {
        this.name = name;
        Lastname = lastname;
    }

    public Person() {

    }

    public String nameLastname() {
        return "name: " + name + ", " + "Lastname: " + Lastname;

    }

}