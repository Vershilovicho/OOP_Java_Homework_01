package Homework_05.Service;

import Homework_05.Model.StudyGroup;
import Homework_05.Model.Student;
import Homework_05.Model.Teacher;
import java.util.List;

public interface Service {

    StudyGroup createListGroup(List<Student> studentList, Teacher teacher);

    List<Student> getStudents();

    Teacher getTeacher();
}