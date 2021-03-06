package com.zipcoder.io.SpringLearnerLab.essentials;

import java.util.ArrayList;
import java.util.Arrays;

public class Students extends People<Student> {

    public Students(Student...students) {
        super(new ArrayList<>(Arrays.asList(students)));
    }

}
