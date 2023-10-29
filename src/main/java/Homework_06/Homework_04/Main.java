package Homework_06.Homework_04;

//— Создать класс Учитель;
//— Создать класс УчительГруппа и реализовать с параметризацией;
//— Создать несколько несколько наследников класса учитель и использовать их с УчительГруппой

//public class Main {
//        public static void main(String[] args) {
//            TeacherGroup<Teacher> teachers = new TeacherGroup("teachers");
//            teachers.add(new ChemistryTeacher("Потапов", "Анатолий", "Леонович"));
//            teachers.add(new BiologyTeacher("Кретинина", "Елена", "Анатольевна"));
//
//            for (int index = 0; index < teachers.count(); index++) {
//                System.out.println(teachers.get(index));
//            }
//        }
//    }




import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        /*
        Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов,
        усвоенных на семинаре.
        Нужно в проекте прокомментировать участки кода, которые рефакторим,
        какой принцип применяем и почему.
         */

        ArrayList<Teacher> listT = new ArrayList<>();

        listT.add(new ChemistryTeacher(
                "Анатолий",
                "Потапов",
                "Леонович", 5));

        listT.add(new BiologyTeacher(
                "Елена",
                "Кретинина",
                "Анатольевна", 15));

        Iterator<Teacher> teacherIterator = listT.iterator();
        while (teacherIterator.hasNext()) {
            System.out.println(teacherIterator.next().toString());
        }
    }
}