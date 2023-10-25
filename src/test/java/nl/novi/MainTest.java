package nl.novi;

import org.junit.jupiter.api.Test;

import static nl.novi.Main.printSiblings;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void aParentShouldHaveChildrenifAChildHasThatParent() {
        //arrange:
        Person father = new Person("father", "Lastname", 40, 'm');
        Person mother = new Person("father", "Lastname", 40, 'f');
        Person child = new Person("child", "Lastname", 10, 'm');

        //act:
        child.addParents(father, mother, child);

        //assert:
        assertEquals(father.getName(), child.getFather().getName());
    }

    @Test
    void printSiblingsShouldnotReturnOwnName() {
        //arrange:
        Person father = new Person("father", "Lastname", 40, 'm');
        Person mother = new Person("father", "Lastname", 40, 'f');
        Person child = new Person("child", "Lastname", 10, 'm');
        Person child2 = new Person("child2", "Lastname", 11, 'f');

        //act:
        child.addParents(father, mother, child);
        child2.addParents(father, mother, child2);
        printSiblings(child2);
        //assert:
        for (Person sib : child.getSiblings()) {

            assertNotEquals(child.getName(), sib.getName());
        }
    }

    @Test
    void  noWokeAllowed(){
        //arrange:
        Person father = new Person("father", "Lastname", 40, 'm');

        //act:
        father.setSex('x');
        //
        assertNotEquals('m', father.getSex());
        assertNotEquals('f', father.getSex());

    }
}