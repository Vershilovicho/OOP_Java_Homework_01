package Homework_05.Model;
 /*
    — Создать класс УчебнаяГруппа, содержащий в себе поля
    Преподаватель и список Студентов;
     */
import java.util.List;
public class StudyGroup extends Group<Student> {
    private Teacher teacher;

    public StudyGroup(int numberOfGroup, List<Student> users, Teacher teacher) {
        super(numberOfGroup, users);
        this.teacher = teacher;
    }

    public StudyGroup(int numberOfGroup, Teacher teacher) {
        super(numberOfGroup);
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudyGroup: " + getTeacher() + "," + "\n"
                + "group of students " + getNumberOfGroup() + "\n"
                + "students: " + getUsers() + ".";

    }
}
