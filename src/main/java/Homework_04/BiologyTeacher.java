package Homework_04;


public class BiologyTeacher extends Teacher {

        protected BiologyTeacher(String lName, String fName, String surName) {
            super(lName, fName, surName);
        }

//        @Override
//        public String toString() {
//            return "Учитель музыки - {" +
//                    "ФИО = " + lName + ' ' + fName + ' ' + surName + '}';
//        }

    @Override
    public String toString() {
        return "BiologyTeacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}

