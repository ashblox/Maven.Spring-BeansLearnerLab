package com.zipcoder.io.SpringLearnerLab.configTest;

import com.zipcoder.io.SpringLearnerLab.config.StudentConfig;
import com.zipcoder.io.SpringLearnerLab.essentials.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration (classes = StudentConfig.class)
public class StudentConfigTest {

    @Autowired
    @Qualifier("students")
    private Students currentStudents;


    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Test
    public void testCurrentStudents() {
        // Given
        String expected = "People{personList=[Student{id=0, name='Davis'}, Student{id=1, name='Kate'}, " +
                "Student{id=2, name='Thao'}, Student{id=3, name='Nirmala'}, Student{id=4, name='Aswathy'}, " +
                "Student{id=5, name='Cara'}, Student{id=6, name='Ashley'}, Student{id=7, name='David'}, " +
                "Student{id=8, name='Sean'}, Student{id=9, name='Charlie'}]}";

        // When
        String actual = currentStudents.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStudents() {
        // Given
        String expected = "People{personList=[Student{id=0, name='Nafis'}, Student{id=1, name='Garrett'}, " +
                "Student{id=2, name='Jonathan'}, Student{id=3, name='Michelle'}, Student{id=4, name='Simon'}, " +
                "Student{id=5, name='Frankie'}, Student{id=6, name='Chad'}, Student{id=7, name='Khalil'}, " +
                "Student{id=8, name='Steffon'}, Student{id=9, name='Rachelle'}]}";

        // When
        String actual = previousStudents.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
