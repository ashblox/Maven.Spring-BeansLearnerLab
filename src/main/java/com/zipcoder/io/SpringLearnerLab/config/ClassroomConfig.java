package com.zipcoder.io.SpringLearnerLab.config;

import com.zipcoder.io.SpringLearnerLab.essentials.Classroom;
import com.zipcoder.io.SpringLearnerLab.essentials.Instructors;
import com.zipcoder.io.SpringLearnerLab.essentials.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ClassroomConfig {

    @Bean
    @Primary
    public Classroom currentCohort(@Qualifier("students") Students students, Instructors instructors) {

        return new Classroom(students, instructors);
    }

    @Bean
    public Classroom previousCohort(@Qualifier("previousStudents") Students students, Instructors instructors) {
        return new Classroom(students, instructors);
    }

}
