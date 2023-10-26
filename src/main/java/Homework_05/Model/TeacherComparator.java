package Homework_05.Model;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher x1, Teacher x2) {
        int resultOfComparing = x1.getSecondName().compareTo(x2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = x1.getFirstName().compareTo(x2.getFirstName());
        } else {
            return resultOfComparing;
        }
        return resultOfComparing;
    }
}