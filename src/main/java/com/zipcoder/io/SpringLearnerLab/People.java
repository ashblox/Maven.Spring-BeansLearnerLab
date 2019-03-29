package com.zipcoder.io.SpringLearnerLab;

import java.util.Iterator;
import java.util.List;

public abstract class People<T extends Person> implements Iterable<T> {

    private List<T> personList;

    public People(List<T> personList) {
        this.personList = personList;
    }

    public void add(T person) {
        personList.add(person);
    }

    public void remove(T person) {
        personList.remove(person);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<T> iterable) {
        iterable.forEach(personList::add);
    }

    public T findById(long id) {
        T t = null;
        for (T person : personList) {
            if (person.getID() == id) {
                t = person;
            }
        }
        if (t == null) {
            throw new NullPointerException();
        }
        return t;
    }

    public List<T> findAll() {
        return personList;
    }

    @Override
    public Iterator<T> iterator() {
        return personList.iterator();
    }

}
