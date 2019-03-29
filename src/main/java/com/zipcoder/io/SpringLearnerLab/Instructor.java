package com.zipcoder.io.SpringLearnerLab;

import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Instructor extends Person implements Teacher{

    public Instructor(long ID, String name) {
        super(ID, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        long count = StreamSupport.stream(learners.spliterator(), false).count();
        learners.forEach((Consumer<Learner>) learner -> learner.learn(numberOfHours/count));
    }

}
