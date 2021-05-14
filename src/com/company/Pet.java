package com.company;

public class Pet {
    private String name;
    private String animalType;
    private int age;

    public void Pet(String animalType, String name, int age) {
        this.animalType = animalType;
        this.name = name;
        this.age = age;
    }

    public String getAnimal() {
        return animalType;
    }

    public void setAnimal(String animalType) {
        this.animalType = animalType;
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
}
