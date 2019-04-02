package com.zipcoder.io.SpringLearnerLab.additionalComponentsTest;

import com.zipcoder.io.SpringLearnerLab.additionalComponents.Alumni;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlumniTest {

    @Autowired
    private Alumni alumni;

    @Test
    public void executeBootcampTest1() {
        // Given
        int numberOfStudents = alumni.getStudents().size();
        double[] expected = new double[numberOfStudents];
        int numberOfHoursPerStudent = 1200;
        for (int i = 0; i < expected.length; i++) {
            expected[i] = alumni.getStudents().findAll().get(i).getTotalStudyTime() + numberOfHoursPerStudent;
        }

        // When
        alumni.executeBootcamp();
        double[] actual = new double[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            actual[i] = alumni.getStudents().findAll().get(i).getTotalStudyTime();
        }

        // Then
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], actual[i], 0.0001);
        }
    }

    @Test
    public void executeBootcampTest2() {
        // Given
        int numberOfInstructors = alumni.getInstructors().size();
        int numberOfStudents = alumni.getStudents().size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;
        double[] expected = new double[numberOfInstructors];
        for (int i = 0; i < expected.length; i++) {
            expected[i] = alumni.getInstructors().findAll().get(i).getNumberOfHoursTaught() + numberOfHoursPerInstructor;
        }

        // When
        alumni.executeBootcamp();
        double[] actual = new double[numberOfInstructors];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = alumni.getInstructors().findAll().get(i).getNumberOfHoursTaught();
        }

        // Then
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], actual[i], 0.0001);
        }
    }
}
