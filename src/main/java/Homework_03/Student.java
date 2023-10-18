package Homework_03;

public class Student implements Comparable<Student> {
    private String Name;
    private String Surname;
    private int Age;


    public Student(String name, String surname, int age) {
        Name = name;
        Surname = surname;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return Age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age=" + Age +
                '}';
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.Surname.length() - otherStudent.getSurname().length();
    }
}