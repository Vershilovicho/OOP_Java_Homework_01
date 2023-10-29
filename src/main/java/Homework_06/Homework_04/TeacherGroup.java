package Homework_06.Homework_04;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//public class TeacherGroup <T extends Teacher> implements Iterable <Teacher> {
//    private String nameGroup;
//    private List<T> numberOfTeachers;
//    private int index;
//
//    public TeacherGroup(String nameGroup) {
//        this.numberOfTeachers = new ArrayList<>();
//        this.nameGroup = nameGroup;
//
//    }
//
//    public String getNameGroup() {
//        return nameGroup;
//    }
//
//
//    public void add(T teacher){
//        numberOfTeachers.add(teacher);
//    }
//
//    public int count() {
//        return numberOfTeachers.size();
//    }
//
//    public T get(Integer index) {
//        return numberOfTeachers.get(index);
//    }
//
//    public TeachersIterator TeachersIterator() {
//        return new TeachersIterator(numberOfTeachers);
//    }
//
//    @Override
//    public Iterator<Teacher> iterator() {
//        return new TeachersIterator(numberOfTeachers);
//    }
//
//    private class TeachersIterator implements Iterator<Teacher> {
//        private List<T> numberOfTeachers;
//
//        public TeachersIterator(List<T> numberOfTeachers) {
//            this.numberOfTeachers = numberOfTeachers;
//            int counter = 0;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return index < numberOfTeachers.size() - 1;
//        }
//
//        @Override
//        public T next() {
//            if (hasNext()) {
//                return numberOfTeachers.get(index++);
//            }
//            return null;
//        }
//
//        @Override
//        public void remove() {
//            numberOfTeachers.remove(numberOfTeachers.get(index));
//        }
//    }
//
//}
import Homework_06.Homework_04.UserGroup;

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
    public Iterator<Teacher> iterator() { // чтобы итератор работал, необходимо вернуть новый экземпляр
        // класса teacher.TeacherGroupIterator с пометкой this
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