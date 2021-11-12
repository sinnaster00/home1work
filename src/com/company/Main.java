package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(17,"Africa","a lot of ");
        Lion lion = new Lion(13,"Africa ","Brown ",12,SkinEnum.DIAMOND);
        LionCub lionCub = new LionCub(3,"Africa","Black ",12,SkinEnum.MAGICK);

        System.out.println(animal.getInfo());
        System.out.println("-----__________-----");
        System.out.println(lion.getInfo());
        lion.makeVoice("Arrr Arr Arrr",5);
        System.out.println("-----__________-----");
        System.out.println(lionCub.getInfo());
        lionCub.makeVoice("Arrr",2);

    }
}
