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
}
