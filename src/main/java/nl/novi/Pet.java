package nl.novi;

import java.util.ArrayList;

public class Pet {
    private String name;
    private int age;
    private String species;
    private Person owner;

    Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
}
