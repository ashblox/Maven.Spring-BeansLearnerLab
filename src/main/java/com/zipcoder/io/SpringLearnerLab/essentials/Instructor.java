package com.zipcoder.io.SpringLearnerLab.essentials;

import java.util.function.Consumer;
import java.util.stream.StreamSupport;

public class Instructor extends Person implements Teacher{

    private double numberOfHoursTaught;

    public Instructor(long ID, String name) {
        super(ID, name);
        numberOfHoursTaught = 0.0;
    }

    public double getNumberOfHoursTaught() {
        return numberOfHoursTaught;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        numberOfHoursTaught += numberOfHours;
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        long count = StreamSupport.stream(learners.spliterator(), false).count();
        learners.forEach((Consumer<Learner>) learner -> learner.learn(numberOfHours/count));
        numberOfHoursTaught += numberOfHours;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + getID() +
                ", name='" + getName() + '\'' +
                '}';
    }

}
