package com.zipcoder.io.SpringLearnerLab.config;

import com.zipcoder.io.SpringLearnerLab.essentials.Student;
import com.zipcoder.io.SpringLearnerLab.essentials.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        Student[] stuArr = new Student[10];
        String[] stuNames = {"Davis", "Kate", "Thao", "Nirmala", "Aswathy", "Cara", "Ashley", "David", "Sean", "Charlie"};
        for (int i = 0; i < stuArr.length; i++) {
            stuArr[i] = new Student(i, stuNames[i]);
        }
        return new Students(stuArr);
    }

    @Bean
    public Students previousStudents() {
        Student[] stuArr = new Student[10];
        String[] stuNames = {"Nafis", "Garrett", "Jonathan", "Michelle", "Simon", "Frankie", "Chad", "Khalil", "Steffon", "Rachelle"};
        for (int i = 0; i < stuArr.length; i++) {
            stuArr[i] = new Student(i, stuNames[i]);
        }
        return new Students(stuArr);
    }
}
