package com.TMS.Less10;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private String name;
    private boolean isY;
    private int Salary;
    List<Child> children = new ArrayList<>();

    public Family(String name, boolean isY, int salary, List<Child> children) {
        this.name = name;
        this.isY = isY;
        Salary = salary;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isY() {
        return isY;
    }

    public void setY(boolean y) {
        isY = y;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", isY=" + isY +
                ", Salary=" + Salary +
                ", children=" + children +
                '}';
    }

}
