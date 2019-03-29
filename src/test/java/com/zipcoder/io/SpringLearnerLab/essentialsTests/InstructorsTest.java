package com.zipcoder.io.SpringLearnerLab.essentialsTests;

import com.zipcoder.io.SpringLearnerLab.essentials.Instructor;
import com.zipcoder.io.SpringLearnerLab.essentials.Instructors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InstructorsTest {

    private Instructors instructors;

    @Before
    public void setUp() {
        Instructor[] instructorArr = new Instructor[5];
        for (int i = 0; i < instructorArr.length; i++) {
            instructorArr[i] = new Instructor(0, "");
        }
        instructors = new Instructors(instructorArr);
    }

    @Test
    public void add() {
        // Given
        Long id = 567l;
        Instructor expected = new Instructor(id, "");

        // When
        instructors.add(expected);
        Instructor actual = instructors.findById(id);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void remove() throws NullPointerException {
        // Given
        Long id = 789l;
        Instructor toBeRemoved = new Instructor(id, "");
        instructors.add(toBeRemoved);

        // When
        instructors.remove(toBeRemoved);
        Instructor removed = instructors.findById(id); // throws exception
    }

    @Test
    public void size() {
        // Given
        int expected = 5;
        Instructor[] stuArr = new Instructor[expected];
        for (int i = 0; i < stuArr.length; i++) {
            stuArr[i] = new Instructor(0, "");
        }
        Instructors theseInstructors = new Instructors(stuArr);

        // When
        int actual = theseInstructors.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clear() {
        // Given
        Instructor[] stuArr = new Instructor[4];
        for (int i = 0; i < stuArr.length; i++) {
            stuArr[i] = new Instructor(0, "");
        }
        Instructors theseInstructors = new Instructors(stuArr);
        int expected = 0;

        // When
        theseInstructors.clear();
        int actual = theseInstructors.size(); // throws exception

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addAll() {
        // Given
        List<Instructor> stuList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stuList.add(new Instructor(i, ""));
        }

        // When
        instructors.addAll(stuList);

        // Then
        for (int i = 0; i < 5; i++) {
            Assert.assertNotNull(instructors.findById(i));
        }
    }

    @Test
    public void findAll() {
        // Given
        Instructor[] stuArr = new Instructor[4];
        for (int i = 0; i < stuArr.length; i++) {
            stuArr[i] = new Instructor(0, "");
        }
        Instructors theseInstructors = new Instructors(stuArr);

        // When
        List<Instructor> actual = theseInstructors.findAll();

        // Then
        for (Instructor expected : stuArr) {
            Assert.assertTrue(actual.contains(expected));
        }
    }

}