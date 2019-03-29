package com.zipcoder.io.SpringLearnerLab.essentialsTests;

import com.zipcoder.io.SpringLearnerLab.essentials.Student;
import com.zipcoder.io.SpringLearnerLab.essentials.Students;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentsTest {

    private Students students;

    @Before
    public void setUp() {
        Student[] studentArr = new Student[5];
        for (int i = 0; i < studentArr.length; i++) {
            studentArr[i] = new Student(0, "");
        }
        students = new Students(studentArr);
    }

    @Test
    public void add() {
        // Given
        Long id = 567l;
        Student expected = new Student(id, "");

        // When
        students.add(expected);
        Student actual = students.findById(id);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void remove() throws NullPointerException {
        // Given
        Long id = 789l;
        Student toBeRemoved = new Student(id, "");
        students.add(toBeRemoved);

        // When
        students.remove(toBeRemoved);
        Student removed = students.findById(id); // throws exception
    }

    @Test
    public void size() {
        // Given
        int expected = 5;
        Student[] stuArr = new Student[expected];
        for (int i = 0; i < stuArr.length; i++) {
            stuArr[i] = new Student(0, "");
        }
        Students theseStudents = new Students(stuArr);

        // When
        int actual = theseStudents.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clear() {
        // Given
        Student[] stuArr = new Student[4];
        for (int i = 0; i < stuArr.length; i++) {
            stuArr[i] = new Student(0, "");
        }
        Students theseStudents = new Students(stuArr);
        int expected = 0;

        // When
        theseStudents.clear();
        int actual = theseStudents.size(); // throws exception

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addAll() {
        // Given
        List<Student> stuList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stuList.add(new Student(i, ""));
        }

        // When
        students.addAll(stuList);

        // Then
        for (int i = 0; i < 5; i++) {
            Assert.assertNotNull(students.findById(i));
        }
    }

    @Test
    public void findAll() {
        // Given
        Student[] stuArr = new Student[4];
        for (int i = 0; i < stuArr.length; i++) {
            stuArr[i] = new Student(0, "");
        }
        Students theseStudents = new Students(stuArr);

        // When
        List<Student> actual = theseStudents.findAll();

        // Then
        for (Student expected : stuArr) {
            Assert.assertTrue(actual.contains(expected));
        }
    }

}