package com.zipcoder.io.SpringLearnerLab.config;

import com.zipcoder.io.SpringLearnerLab.essentials.Instructor;
import com.zipcoder.io.SpringLearnerLab.essentials.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors() {
        Instructor[] instArr = new Instructor[6];
        for (int i = 0; i < instArr.length; i++) {
            instArr[i] = new Instructor(i, "TcUsaInstructor" + i);
        }
        return new Instructors(instArr);
    }

    @Bean(name = "TC UK instructors")
    public Instructors tcUkInstructors() {
        Instructor[] instArr = new Instructor[5];
        for (int i = 0; i < instArr.length; i++) {
            instArr[i] = new Instructor(i, "TcUkInstructor" + i);
        }
        return new Instructors(instArr);
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors zipCodeInstructors() {
        Instructor[] instArr = new Instructor[6];
        String[] instNames = {"Kris", "Nhu", "Dolio", "Leon", "Froilan", "Wilhem"};
        for (int i = 0; i < instArr.length; i++) {
            instArr[i] = new Instructor(i, instNames[i]);
        }
        return new Instructors(instArr);
    }
}
