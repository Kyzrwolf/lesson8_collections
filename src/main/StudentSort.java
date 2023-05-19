package main;

import java.util.Comparator;

public class StudentSort implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2 ) {
        if (student1.getFirstName().equals(student2.getFirstName())) {
            return student2.getAge() - student1.getAge();
        }
        return student1.getFirstName().compareTo(student2.getFirstName());
    }
}
