package com.TMS.Less10;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int age;
    private boolean isY;

    public User(String name, int age, boolean isY) {
        this.name = name;
        this.age = age;
        this.isY = isY;
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

    public boolean isY() {
        return isY;
    }

    public void setY(boolean y) {
        isY = y;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isY=" + isY +
                '}';
    }
}
