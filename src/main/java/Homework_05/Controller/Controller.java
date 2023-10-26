package Homework_05.Controller;

 /*
    Создать метод в Контроллере, в котором агрегируются функции
    получения списка студентов (их id) и преподавателя (его id) и
    формирования учебной группы, путём вызова метода из сервиса;
     */
import Homework_05.Model.StudyGroup;
import Homework_05.Model.Student;
import Homework_05.Model.Teacher;
import Homework_05.Service.Service;
import Homework_05.Service.StudyGroupService;

import java.util.List;

public class Controller implements Service {
    StudyGroupService studyGroupService;

    public Controller() {
        this.studyGroupService = new StudyGroupService();
    }

    @Override
    public StudyGroup createListGroup(List<Student> studentList, Teacher teacher) {
        StudyGroup studyGroup = null;
        if (studentList != null && teacher != null) {
            studyGroup = studyGroupService.createListGroup(studentList, teacher);
        } else {
            System.out.println("Ошибка при создании группы");
        }
        return studyGroup;
    }

    @Override
    public List<Student> getStudents() {
        return studyGroupService.getStudents();
    }
    public Teacher getTeacher() {
        return studyGroupService.getTeacher();
    }
}