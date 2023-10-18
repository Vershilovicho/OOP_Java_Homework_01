package Homework_03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student Alex = new Student("Alex", "Popov", 20);
        Student Masha = new Student("Masha", "Ivanova", 22);
        Student Aleksandr = new Student("Aleksandr", "Popovich", 25);

        List<Student> numberofGroup = new ArrayList<>();
        numberofGroup.add(Alex);
        numberofGroup.add(Masha);
        numberofGroup.add(Aleksandr);

        System.out.println("iterating:");
        Iterator<Student> iterator = numberofGroup.iterator();
        while (iterator.hasNext()) {
            Student person = iterator.next();
            System.out.println("Name: " + person.getName());
            System.out.println("Surname: " + person.getSurname());
            System.out.println("Age: " + person.getAge());
        }

        Comparator<Student> studentComp = new StudentComporator()
                .thenComparing(new StudentComporator.StudentAgeComparator());
        TreeSet<Student> checkStudents = new TreeSet<>(studentComp);
        checkStudents.add(new Student("Nikol", "Petrov", 25));
        checkStudents.add(new Student("Nina", "Popova", 22));
        checkStudents.add(new Student("Vera", "Ivanova", 27));
        for(Student std : checkStudents){

            System.out.println(std.getName() + " -> " + std.getAge() + " years old");
        }
    }
}