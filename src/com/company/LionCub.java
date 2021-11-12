package com.company;

public class LionCub extends Lion{
    private String name;
    private String Simba;

    public String getName() {
        return name;
    }

    public String getSimba() {
        return Simba;
    }

    public LionCub(int age, String back, String color, int cash, SkinEnum skin) {
        super(age, back, color, cash, skin);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nLionCub name: " + name +
                "\nSimba: " + Simba;
    }

}
