package com.company;

public class Lion extends Animal{
    private int cash;
    private SkinEnum skin;

    public Lion(int age, String back, String color) {
        super(age, back, color);
    }

    public int getCash() {
        return cash;
    }

    public SkinEnum getSkin() {
        return skin;
    }

    public Lion(int age, String back, String color, int cash, SkinEnum skin) {
        super(age, back, color);
        this.cash = cash;
        this.skin = skin;
    }

    final void makeVoice(String voice, int number){
        for(int i = 0; i < number; ++i) {
            System.out.println(voice);
        }
    }
    void makeVoice(String voice){
        System.out.println(voice);
    }
    @Override
    public String getInfo() {
        return super.getInfo() + "\nskin" + skin +
                "\ncash" + cash;
    }
}
