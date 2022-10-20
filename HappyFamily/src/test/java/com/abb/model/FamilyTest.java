package com.abb.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    Human mother = new Human("Jane", "Karleone", 1970);
    Human father = new Human("Vito ", "Karleone ", 1965);
    Family family = new Family(mother, father);
    Human child1 = new Human("Michael", "Karleoone", 1990);
    Human child2 = new Human("Sunny", "Karleoone", 1993);
    Human child3 = new Human("Orxan", "Mehmanov", 1994);

    @Test
    void testToString() {

        String expected = "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=[]" +
                ", pet=null"+
                '}';
        String actual = family.toString();
        assertEquals(expected, actual);

    }
    @Test
    void testDeleteChild_whenValidIndex(){

        family.addChild(child1);
        family.addChild(child2);
        Human [] arrayHuman = family.getChildren();
        family.deleteChild(1);
        Human [] arrayHuman2 = family.getChildren();
        assertNotEquals(arrayHuman, arrayHuman2);
    }
    @Test
    void testDeleteChild_whenInvalidIndex(){
        family.addChild(child1);
        family.addChild(child2);
        Human [] arrayHuman = family.getChildren();
        family.deleteChild(3);
        Human [] arrayHuman2 = family.getChildren();
        assertEquals(arrayHuman, arrayHuman2);
    }
    @Test
    void testDeleteChild_whenValidHuman(){
        family.addChild(child1);
        family.addChild(child2);
        Human [] arrayHuman = family.getChildren();
        family.deleteChild(child1);
        Human[] arrayHUman2 = family.getChildren();
        assertNotEquals(arrayHuman, arrayHUman2);

    }
    @Test
    void testDeleteChild_whenInValidHuman(){
        family.addChild(child1);
        family.addChild(child2);
        Human [] arrayHuman = family.getChildren();
        family.deleteChild(child3);
        Human[] arrayHUman2 = family.getChildren();
        assertEquals(arrayHuman, arrayHUman2);
    }
    @Test
    void testAddChild(){
        int lenghtChildern = family.getChildren().length;
        family.addChild(child1);
        int lenghtChildren02 = family.getChildren().length;
        int difference = lenghtChildren02 - lenghtChildern;
        int expected = 1;
        assertEquals(expected, difference);

    }
    @Test
    void testCountFamily(){
        int countChildren = family.getChildren().length;
        int expected = countChildren + 2;
        int actual = family.countFamily();
        assertEquals(expected, actual);
    }


}