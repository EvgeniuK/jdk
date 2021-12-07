package com.TMS.Less9;

import java.util.Objects;

public class User implements Comparable<User> {

    private String name;
    private int age;
    private Gender gender;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public User(int age, String name, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public User() {
    }

    @Override
    public int compareTo(User o) {
        if (this.age == o.getAge()) {
            String s = String.valueOf(this.name.charAt(0));
            return s.compareTo(String.valueOf(o.name.charAt(0)));
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 1;
        }


    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}



