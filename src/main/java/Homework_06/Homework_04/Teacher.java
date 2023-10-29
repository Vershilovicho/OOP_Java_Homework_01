package Homework_06.Homework_04;

public class Teacher extends User implements UserInterface{

    /*
    В классе Teacher реализован принцип единственной ответственности (Single Responsibility Principle), т.к. он
    наследуется от класса User, но имеет одно поле (teacherId).
    Принцип единственной ответственности реализован также в классе TeacherGroup,
    которые наследуются от UserGroup.

    Принцип подстановки Барбары Лисков можно проверить путем замены объектов наследниками,
    и если класс User заменить на
    Teacher, то программа продолжит работать без изменения свойств.

    Принцип открытости/зактрытости реализован в классах User, Teacher путем создания getter и setter,
    при обращении к полям класса через эти методы соблюдается принцип закрытости сущностей для модификации,
    а создание классов-наследников (таких как Teacher, ChemistryTeacher, BiologyTeacher),
    позволяет соблюсти принцип открытости -
    то есть наши сущности открыты для дальнейших расширений.
  */
    protected int teacherId;

    public Teacher(String firstName, String lastName, String surName, int teacherId) {
        super();
        setFirstName(firstName);
        setLastName(lastName);
        setSurName(surName);
        setTeacherId(teacherId);
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }


    @Override
    public String toString() {
        return "Преподаватель: " +
                "фамилия - " + getLastName() +
                ", имя -  " + getFirstName() +
                ", отчество -  " + getSurName() +
                ", teacherId: " + getTeacherId() + ".";
    }
}