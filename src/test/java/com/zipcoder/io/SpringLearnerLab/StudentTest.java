package com.zipcoder.io.SpringLearnerLab;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void learn() {
        // Given
        Student student = new Student(0, "");
        double numberOfHours = 2.0;
        double expected = student.getTotalStudyTime() + numberOfHours;

        // When
        student.learn(numberOfHours);
        double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, 0.0001);
    }

}