package Homework_06.Homework_04;

import Homework_06.Homework_04.abstractClass.AbstractUser;

public class User extends AbstractUser implements UserInterface{
        protected String firstName;
        protected String lastName;
        protected String surName;
        protected Integer userId;

        public User(String firstName, String lastName, String surName, Integer userId) {
            setFirstName(firstName);
            setLastName(lastName);
            setSurName(surName);
            setUserId(userId);
        }

        public User() {
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getSurName() {
            return surName;
        }

        public void setSurName(String surName) {
            this.surName = surName;
        }


        public Integer getUserId() {

            return userId;
        }

        public void setUserId(int userId) {

            this.userId = userId;
        }

        @Override
        public String toString() {
            return "users.User " +
                    "имя " + getFirstName() + '\'' +
                    ", фамилия " + getLastName() + '\'' +
                    ", отчество " + getSurName() + '\'' +
                    ", id " + getUserId() +
                    '.';
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) {
//                return true;
//            }
//            if (!(o instanceof User)) {
//                return false;
//            }
//
//            User user = (User) o;
//
//            if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) :
//                    user.getFirstName() != null) {
//                return false;
//            }
//            if (getSecondName() != null ? !getSecondName().equals(user.getSecondName()) :
//                    user.getSecondName() != null) {
//                return false;
//            }
//            if (getPatronymic() != null ? !getPatronymic().equals(user.getPatronymic()) :
//                    user.getPatronymic() != null) {
//                return false;
//            }
//            if (getUserId() != null ? !getUserId().equals(user.getUserId()) : user.getUserId() != null) {
//                return false;
//            }
//            return getDateOfBirth() != null ? !getDateOfBirth().equals(user.getDateOfBirth()) :
//                    user.getDateOfBirth() == null;
//        }
//    }

}
