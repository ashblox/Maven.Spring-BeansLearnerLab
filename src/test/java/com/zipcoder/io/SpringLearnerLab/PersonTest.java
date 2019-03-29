package com.zipcoder.io.SpringLearnerLab;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getID() {
        // Given
        long expected = 345;
        Person person = new Person(expected, "");

        // When
        long actual = person.getID();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        // Given
        String expected = "Abby";
        Person person = new Person(0, expected);

        // When
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setName() {
        // Given
        Person person = new Person(0, "");
        String expected = "Moe";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }
}