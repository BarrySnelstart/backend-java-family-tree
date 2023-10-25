package nl.novi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    void personShouldHaveAPet (){
        // arrange
        Person testPerson = new Person("father", "Lastname", 40, 'm');
        Pet cat = new Pet ("mieuwy", 15, "cat");
        // act
        testPerson.addPet(testPerson, cat);
        // assert
        assertEquals(1, testPerson.getPets().size());

    }
}