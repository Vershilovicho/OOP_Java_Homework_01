package Homework_06.Homework_04;

import Homework_06.Homework_04.abstractClass.AbstractUserGroup;


public class UserGroup extends AbstractUserGroup {
    int numberGroup;
    public UserGroup() {
    }

    public UserGroup(int numberGroup) {
        setNumberGroup(numberGroup);
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    @Override
    public String toString() {
        return "UserGroup{}" + getNumberGroup() + ".";
    }
}