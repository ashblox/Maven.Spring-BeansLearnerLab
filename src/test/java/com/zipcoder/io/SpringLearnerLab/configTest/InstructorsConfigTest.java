package com.zipcoder.io.SpringLearnerLab.configTest;

import com.zipcoder.io.SpringLearnerLab.config.InstructorsConfig;
import com.zipcoder.io.SpringLearnerLab.essentials.Instructors;
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
@ContextConfiguration(classes = InstructorsConfig.class)
public class InstructorsConfigTest {

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors tcUkInstructors;

    @Autowired
    private Instructors zipCodeInstructors;

    @Test
    public void tcUsaInstructorsTest() {
        // Given
        String expected = "People{personList=[Instructor{id=0, name='TcUsaInstructor0'}, Instructor{id=1, " +
                "name='TcUsaInstructor1'}, Instructor{id=2, name='TcUsaInstructor2'}, Instructor{id=3, " +
                "name='TcUsaInstructor3'}, Instructor{id=4, name='TcUsaInstructor4'}, Instructor{id=5, " +
                "name='TcUsaInstructor5'}]}";

        // When
        String actual = tcUsaInstructors.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tcUkInstructorsTest() {
        // Given
        String expected = "People{personList=[Instructor{id=0, name='TcUkInstructor0'}, Instructor{id=1, " +
                "name='TcUkInstructor1'}, Instructor{id=2, name='TcUkInstructor2'}, Instructor{id=3, " +
                "name='TcUkInstructor3'}, Instructor{id=4, name='TcUkInstructor4'}]}";

        // When
        String actual = tcUkInstructors.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void instructorsTest() {
        // Given
        String expected = "People{personList=[Instructor{id=0, name='Kris'}, Instructor{id=1, name='Nhu'}, " +
                "Instructor{id=2, name='Dolio'}, Instructor{id=3, name='Leon'}, Instructor{id=4, name='Froilan'}, " +
                "Instructor{id=5, name='Wilhem'}]}";

        // When
        String actual = zipCodeInstructors.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
