package com.zipcoder.io.SpringLearnerLab.additionalComponents;

import com.zipcoder.io.SpringLearnerLab.essentials.Instructor;
import com.zipcoder.io.SpringLearnerLab.essentials.Instructors;
import com.zipcoder.io.SpringLearnerLab.essentials.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    @Qualifier("previousStudents")
    private Students students;

    @Autowired
    private Instructors instructors;

    @PostConstruct
    public void executeBootcamp() {
        for (Instructor instructor : instructors) {
            instructor.lecture(students, (1200.0 * students.size()) / instructors.size());
        }
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
}
