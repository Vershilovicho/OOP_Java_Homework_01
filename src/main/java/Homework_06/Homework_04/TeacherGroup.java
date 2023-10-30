package Homework_06.Homework_04;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class TeacherGroup extends UserGroup implements Iterable<Teacher> {
    private List<Teacher> teachers;

    public TeacherGroup(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public TeacherGroup(String teachers) {
    }

    public List<Teacher> getTeachers() {

        return teachers;
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }

    @Override
    public Spliterator<Teacher> spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public String toString() {
        return "teacher.TeacherGroup{" +
                "teachers=" + getTeachers() +
                '}';
    }
}