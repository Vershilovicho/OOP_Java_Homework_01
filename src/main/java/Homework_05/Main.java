package Homework_05;

//— Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
//— Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
//— Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
// — Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.

import Homework_05.Controller.Controller;
import Homework_05.Model.StudyGroup;
import Homework_05.Model.Student;
import Homework_05.Model.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        Teacher teacherT = new Teacher("Алексей", "Петров", 1);
        Student student1 = new Student("Владимир", "Иванов", 3);
        Student student2 = new Student("Андрей", "Сидоров", 5);
        Student student3 = new Student("Анатолий", "Первый", 10);
        Student student4 = new Student("Кристина", "Сергеева", 2);

        List<Student> listStudent = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));

        Iterator<Student> studentIterator = listStudent.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().toString());
        }
        System.out.println();

        StudyGroup studyGroup = controller.createListGroup(listStudent, teacherT);
        System.out.println(studyGroup);

        // печать через контроллер
        System.out.println(controller.getStudents());
        System.out.println(controller.getTeacher());
    }
}