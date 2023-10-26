package Homework_05.View;

import Homework_05.Model.Student;
import Homework_05.Model.Teacher;
import java.util.List;

public interface View1 {
    void createListGroup(List<Student> studentList, Teacher teacher);
    void getStudents();
    void getTeacher();
}