package com.zipcoder.io.SpringLearnerLab.configTest;

import com.zipcoder.io.SpringLearnerLab.essentials.Classroom;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassroomConfigTest {

    @Autowired
    private Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;

    @Test
    public void currentCohortTest() {
        // Given
        String expected = "Classroom{students=People{personList=[Student{id=0, name='Davis'}, Student{id=1, " +
                "name='Kate'}, Student{id=2, name='Thao'}, Student{id=3, name='Nirmala'}, Student{id=4, " +
                "name='Aswathy'}, Student{id=5, name='Cara'}, Student{id=6, name='Ashley'}, Student{id=7, " +
                "name='David'}, Student{id=8, name='Sean'}, Student{id=9, name='Charlie'}]}, " +
                "" +
                "instructors=People{personList=[Instructor{id=0, name='Kris'}, Instructor{id=1, name='Nhu'}, " +
                "Instructor{id=2, name='Dolio'}, Instructor{id=3, name='Leon'}, Instructor{id=4, name='Froilan'}, " +
                "Instructor{id=5, name='Wilhem'}]}}";

        // When
        String actual = currentCohort.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void previousCohortTest() {
        // Given
        String expected = "Classroom{students=People{personList=[Student{id=0, name='Nafis'}, Student{id=1, " +
                "name='Garrett'}, Student{id=2, name='Jonathan'}, Student{id=3, name='Michelle'}, Student{id=4, " +
                "name='Simon'}, Student{id=5, name='Frankie'}, Student{id=6, name='Chad'}, Student{id=7, " +
                "name='Khalil'}, Student{id=8, name='Steffon'}, Student{id=9, name='Rachelle'}]}, " +
                "" +
                "instructors=People{personList=[Instructor{id=0, name='Kris'}, Instructor{id=1, name='Nhu'}, " +
                "Instructor{id=2, name='Dolio'}, Instructor{id=3, name='Leon'}, Instructor{id=4, name='Froilan'}, " +
                "Instructor{id=5, name='Wilhem'}]}}";

        // When
        String actual = previousCohort.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
