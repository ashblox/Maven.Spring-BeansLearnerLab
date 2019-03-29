package com.zipcoder.io.SpringLearnerLab.essentialsTests;

import com.zipcoder.io.SpringLearnerLab.essentials.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ClassroomTest {

    private Students students;
    private Instructors instructors;
    private Classroom classroom;

    @Before
    public void setUp() {
        // create Students obj
        Student[] studentArr = new Student[5];
        for (int i = 0; i < studentArr.length; i++) {
            studentArr[i] = new Student(i, "");
        }
        students = new Students(studentArr);

        // create Instructors obj
        Instructor[] instructorArr = new Instructor[4];
        for (int i = 0; i < instructorArr.length; i++) {
            instructorArr[i] = new Instructor(i, "");
        }
        instructors = new Instructors(instructorArr);

        // create Classroom obj
        classroom = new Classroom(students, instructors);
    }

    @Test
    public void hostLecture() {
        // Given
        Teacher teacher = instructors.findById(1);
        double numberOfHours = 2.5;
        List<Double> expected = new ArrayList<>();
        for (Student student : students) {
            expected.add(student.getTotalStudyTime() + numberOfHours/students.size());
        }

        // When
        classroom.hostLecture(teacher, numberOfHours);
        List<Double> actual = new ArrayList<>();
        for (Student student : students) {
            actual.add(student.getTotalStudyTime());
        }

        // Then
        for (int i = 0; i < students.size(); i++) {
            Assert.assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void getStudents() {
        // Given
        Students expected = students;

        // When
        Students actual = classroom.getStudents();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setStudents() {
        // Given
        Students expected = new Students(new Student(0, ""), new Student(0, ""));

        // When
        classroom.setStudents(expected);
        Students actual = classroom.getStudents();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getInstructors() {
        // Given
        Instructors expected = instructors;

        // When
        Instructors actual = classroom.getInstructors();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setInstructors() {
        // Given
        Instructors expected = new Instructors(new Instructor(0, ""), new Instructor(0, ""));

        // When
        classroom.setInstructors(expected);
        Instructors actual = classroom.getInstructors();

        // Then
        Assert.assertEquals(expected, actual);
    }
}