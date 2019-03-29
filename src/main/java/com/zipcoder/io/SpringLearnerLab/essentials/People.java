package com.zipcoder.io.SpringLearnerLab.essentials;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People)) return false;
        People<?> people = (People<?>) o;
        return Objects.equals(personList, people.personList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personList);
    }
}
