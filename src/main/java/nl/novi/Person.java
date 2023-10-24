package nl.novi;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private char sex;

    private int age;
    private Person mother;

    private Person father;

    private ArrayList <Person> siblings;


    private List <Person> children;

    private List <Pet> pets;

    Person(String name, String lastName, int age, char sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.children = new ArrayList <Person>();
        this.siblings = new ArrayList <Person>();
        this.pets = new ArrayList <Pet>();
    }

    Person(String name, String middleName, String lastName, int age, char sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.children = new ArrayList <Person>();
        this.siblings = new ArrayList <Person>();
        this.pets = new ArrayList <Pet>();
    }

    void addParents(Person father, Person mother, Person child) {
        this.setFather(father);
        this.setMother(mother);
        addChild(father, mother, child);
    }

    void addChild(Person father, Person mother, Person child) {
        father.setChildren(child);
        mother.setChildren(child);
        addSibling(father, mother, child);
    }

    void addSibling(Person father, Person mother, Person child) {
        for (Person siblingsMotherSide : mother.getChildren()) {
            if (siblingsMotherSide.getName().contains(child.getName())) {
            } else {
                child.siblings.add(siblingsMotherSide);
            }
        }
        for (Person siblingsFatherSide : father.getChildren()) {
            if (siblingsFatherSide.getName().contains(child.getName())) {
            } else {
                child.siblings.add(siblingsFatherSide);
            }
        }
    }


    void getGrandChildren() {
        for (Person child : children) {
            for (Person Grandchild : child.getChildren()) {
                System.out.println(getName() + " Grand Children are : " + Grandchild.getName());
            }
        }
    }

    public String getName() {
        return name;
    }


    public List <Person> getChildren() {
        return children;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setChildren(Person child) {
        this.children.add(child);
    }
}
