package Homework_04;

//— Создать класс Учитель;
//— Создать класс УчительГруппа и реализовать с параметризацией;
//— Создать несколько несколько наследников класса учитель и использовать их с УчительГруппой

public class Main {
        public static void main(String[] args) {
            TeacherGroup<Teacher> teachers = new TeacherGroup("teachers");
            teachers.add(new ChemistryTeacher("Потапов", "Анатолий", "Леонович"));
            teachers.add(new BiologyTeacher("Кретинина", "Елена", "Анатольевна"));

            for (int index = 0; index < teachers.count(); index++) {
                System.out.println(teachers.get(index));
            }
        }
    }

