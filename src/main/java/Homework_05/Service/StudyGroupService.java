package Homework_05.Service;

import Homework_05.Model.StudyGroup;
import Homework_05.Model.Student;
import Homework_05.Model.Teacher;

import java.util.List;

public class StudyGroupService implements Service{
    static Integer idNumber;
    static{
        idNumber = 1;
    }
    private StudyGroup studyGroup;


    public StudyGroupService(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

    public StudyGroupService() {
    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

    @Override
    public StudyGroup createListGroup(List<Student> studentList, Teacher teacher) {
        setStudyGroup(new StudyGroup(idNumber++, studentList, teacher));
        return getStudyGroup();
    }

    @Override
    public List<Student> getStudents() {
        return studyGroup.getUsers();
    }

    @Override
    public Teacher getTeacher() {
        return studyGroup.getTeacher();
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudyGroupService{");
        sb.append("studyGroup=").append(studyGroup);
        sb.append('}');
        return sb.toString();
    }
}