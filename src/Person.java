import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private char sex;

    private int age;
    private Person mother;

    private Person father;

    private List <Person> siblings;

    private List <Person> children;

    private List <Pet> pets;

    Person() {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.siblings = siblings;
        this.pets = pets;


    }
    Person (String name, String lastName, int age, char sex)
    {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }
    Person (String name,String middleName, String lastName, int age, char sex)
    {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }
    void addParents (){}
    void addChild(){}
    void addPet (){}
    void addSibling (){}
    void getGrandChildren (){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List <Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List <Person> siblings) {
        this.siblings = siblings;
    }

    public List <Person> getChildren() {
        return children;
    }

    public void setChildren(List <Person> children) {
        this.children = children;
    }

    public List <Pet> getPets() {
        return pets;
    }

    public void setPets(List <Pet> pets) {
        this.pets = pets;
    }
}
