package com.zipcoder.io.SpringLearnerLab;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void teach() {
        // Given
        Instructor instructor = new Instructor(0, "");
        Student student = new Student(0, "");
        double numberOfHours = 1.0;
        double expected = student.getTotalStudyTime() + numberOfHours;

        // When
        instructor.teach(student, numberOfHours);
        double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void lecture() {
        // Given
        Instructor instructor = new Instructor(0, "");
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            students.add(new Student(0, ""));
        }
        double numberOfHours = 2.0;
        double numberOfHoursPerStudent = numberOfHours/students.size();
        List<Double> expected = new ArrayList<>();
        for (Student student : students) {
            expected.add(student.getTotalStudyTime() + numberOfHoursPerStudent);
        }

        // When
        instructor.lecture(students, numberOfHours);
        List<Double> actual = new ArrayList<>();
        for (Student student : students) {
            actual.add(student.getTotalStudyTime());
        }

        // Then
        for (int i = 0; i < actual.size(); i++) {
            Assert.assertEquals(expected.get(i), actual.get(i), 0.0001);
        }
    }
}