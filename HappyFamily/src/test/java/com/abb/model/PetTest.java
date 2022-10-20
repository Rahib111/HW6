package com.abb.model;

import com.abb.enums.Species;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    void testToString() {
        Pet pet = new Pet(Species.DOG, "Rock", 5,17,null);
        String expected = "Pet{" +
                "species='" + Species.DOG + '\'' +
                ", nickname='Rock'"  +
                ", age=5" +
                ", trickLevel=17"+
                ", habits=null"  +
                '}';
        String actual = pet.toString();
        assertEquals(expected, actual);
    }
}