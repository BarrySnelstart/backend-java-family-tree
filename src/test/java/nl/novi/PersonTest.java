package nl.novi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void bothParentsShouldBeDifferentSex() {
        //arrange:
        Person father = new Person("father", "Lastname", 40, 'm');
        Person mother = new Person("mother", "Lastname", 40, 'f');
        Person child = new Person("child", "Lastname", 10, 'm');
        //act:
        child.addParents(father, mother, child);
        //assert:
        assertNotEquals(child.getMother().getSex(), child.getFather().getSex());
    }

    @Test
    void whenAParentHasAChildAchildShouldHaveAParent() {
        // arrange
        Person father = new Person("father", "Lastname", 40, 'm');
        Person mother = new Person("mother", "Lastname", 40, 'f');
        Person child = new Person("child", "Lastname", 10, 'm');
        Person child2 = new Person("child2", "Lastname", 10, 'm');
        //act:
        child.addParents(father, mother, child);
        //assert:
        assertNotNull(father.getChildren());
        assertNotNull(mother.getChildren());
        assertNotNull(child.getFather());
        assertNotNull(child.getMother());
    }

    @Test
    void siblingsShouldHaveSameAmountOfSiblings() {
        //arrange:
        Person father = new Person("father", "Lastname", 40, 'm');
        Person mother = new Person("mother", "Lastname", 40, 'f');
        Person child = new Person("child", "Lastname", 10, 'm');
        Person child2 = new Person("child2", "Lastname", 10, 'f');
        //act:
        child.addSibling(father, mother, child);
        child2.addSibling(father, mother, child2);
        //assert
        assert (child.getSiblings().size() == child2.getSiblings().size());
    }

    @Test
    void shouldHaveTwoGrandChildren()
    {
        Person grandFather = new Person("father", "Lastname", 40, 'm');
        Person grandMother = new Person("mother", "Lastname", 40, 'f');
        Person father = new Person("parent1", "lastname",21,'f');
        Person mother = new Person("parent2", "lastname",21,'m');
        Person child = new Person("child", "Lastname", 10, 'm');
        Person child2 = new Person("child2", "Lastname", 10, 'f');
        //arrange:
        father.addParents(grandFather, grandMother, father);
        father.addParents(grandFather, grandMother, father);
        child.addParents(father, mother,child );
        child2.addParents(father, mother,child2 );
        // act :
        grandFather.getGrandChildren();
        grandMother.getGrandChildren();
        // assert:
        assertEquals (2, father.getChildren().size());
        assertEquals (2, mother.getChildren().size());
    }

    @Test
    void nameSHouldNotChange() {
        //arrange:
        Person father = new Person("father", "Lastname", 40, 'm');
        //act:
        father.getName();
        //assert:
        assertEquals(father.getName(), "father");

    }
    @Test
    void  childShouldHaveAMother(){
        //arrange:
        Person child = new Person("child", "Lastname", 10, 'm');
        Person mother = new Person("mother", "Lastname", 40, 'f');
        //act:
        child.setMother(mother);
        //assert:
        assertNotNull(child.getMother());
    }
}