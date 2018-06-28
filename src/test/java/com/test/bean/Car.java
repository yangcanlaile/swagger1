package com.test.bean;

public class Car {
    private String name;
    private String color;
    public Car(){}
    public Car(String name, String color) {
        name = this.name;
        color = this.color;
    }

    public void setName(String name) {
        System.out.println("This is setName!!");
        this.name = name;
    }

    public void setColor(String color) {
        System.out.println("This is setColor!!");
        this.color = color;
    }

    public String introduce() {
        return name + "'s: " + color;
    }
}
