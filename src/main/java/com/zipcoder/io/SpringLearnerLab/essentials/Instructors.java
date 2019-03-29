package com.zipcoder.io.SpringLearnerLab.essentials;

import java.util.ArrayList;
import java.util.Arrays;

public class Instructors extends People<Instructor> {

    public Instructors(Instructor... instructors){
        super(new ArrayList<>(Arrays.asList(instructors)));
    }
}
