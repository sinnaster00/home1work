package com.company;

public class Animal {
    private int age;
    private String back;
    private String color;

    public int getAge() {
        return age;
    }

    public Object getSkin() {
        return back;
    }

    public String getColor() {
        return color;
    }

    public Animal(int age, String back, String color) {
        this.age = age;
        this.back = back;
        this.color = color;
    }
    public String getInfo(){
        return "Age: " + age +
                "\nSkinView: " + back +
                "\nColor: " + color;
    }
}
