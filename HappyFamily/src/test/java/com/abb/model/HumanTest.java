package com.abb.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testToString() {
        Human human = new Human("Michael","Karleone", 1970 );
        String expected = "Human{name='Michael', surname='Karleone', year=1970, iq=null, pet=null, mother=null, father=null, schedule=null}";
        String actual = human.toString();
        assertEquals(expected, actual);


    }
}