package com.zipcoder.io.SpringLearnerLab.essentialsTests;

import com.zipcoder.io.SpringLearnerLab.essentials.Student;
import org.junit.Assert;
import org.junit.Test;

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