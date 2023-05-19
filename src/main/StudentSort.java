package main;

import java.util.Comparator;

public class StudentSort implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getFirstName().equals(o2.getFirstName())) {
            return o2.getAge() - o1.getAge();
        }
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
