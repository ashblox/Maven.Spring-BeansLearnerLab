package com.zipcoder.io.SpringLearnerLab.essentials;

public class Student extends Person implements Learner{

    private double totalStudyTime;

    public Student(long ID, String name) {
        super(ID, name);
        totalStudyTime = 0.0;
    }


    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

}
