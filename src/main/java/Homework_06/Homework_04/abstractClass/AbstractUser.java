package Homework_06.Homework_04.abstractClass;

public abstract class AbstractUser {

        /*
        Принцип инверсии зависимостей реализован следующим образом:
        в данном проекте созданы абстрактные классы AbstractUser и AbstractUserGroup, которые не зависят от деталей.
        В абстрактных классах перечислены поля (String firstName, String lastName, String serName),
        которые будут использоваться в проекте, а детали реализованы в классах-наследниках (User, Teacher).
        Модули верхних уровней не зависят от модулей нижних уровней.
         */
        String firstName;
        String lastName;
        String surName;

        public AbstractUser() {
        }

}
