package com.company;

public class Main {

    public static void main(String[] args) {
        Pet myPet = new Pet();
        myPet.Pet("Dog", "Rex", 5);
        System.out.println("My pet is a " + myPet.getAnimal() + ", it name is " + myPet.getName() + ". It is " + myPet.getAge());
    }
}
