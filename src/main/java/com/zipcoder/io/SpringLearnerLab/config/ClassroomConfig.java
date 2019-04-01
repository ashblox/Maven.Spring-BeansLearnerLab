package com.zipcoder.io.SpringLearnerLab.config;

import com.zipcoder.io.SpringLearnerLab.essentials.Classroom;
import com.zipcoder.io.SpringLearnerLab.essentials.Instructors;
import com.zipcoder.io.SpringLearnerLab.essentials.Students;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @DependsOn({"students", "instructors"})
    public Classroom currentCohort(Students students, Instructors instructors) {
        return new Classroom(students, instructors);
    }

    @DependsOn({"previousStudents", "instructors"})
    public Classroom previousCohort(Students students, Instructors instructors) {
        return new Classroom(students, instructors);
    }

}
