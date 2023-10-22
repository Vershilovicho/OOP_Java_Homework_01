package Homework_04;

public class ChemistryTeacher extends Teacher{

        protected ChemistryTeacher(String lName, String fName, String surName) {
            super(lName, fName, surName);
        }

//        @Override
//        public String toString() {
//            return "Учитель математики - {" +
//                    "ФИО = " + lName + ' ' + fName + ' ' + surName + '}';
//        }

    @Override
    public String toString() {
        return "ChemistryTeacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
//

}

