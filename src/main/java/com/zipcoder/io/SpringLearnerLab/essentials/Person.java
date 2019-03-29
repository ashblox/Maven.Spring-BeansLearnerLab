package com.zipcoder.io.SpringLearnerLab.essentials;

public class Person {

    private final long ID;
    private String name;

    public Person(long ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
