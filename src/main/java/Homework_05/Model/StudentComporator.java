package Homework_05.Model;

import java.util.Comparator;

public class StudentComporator implements Comparator<Student> {

    @Override
    public int compare(Student x1, Student x2) {
        int resultOfComparing = x1.getSecondName().compareTo(x2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = x1.getFirstName().compareTo(x2.getFirstName());
        } else {
            return resultOfComparing;
        }
        return resultOfComparing;
    }
}
