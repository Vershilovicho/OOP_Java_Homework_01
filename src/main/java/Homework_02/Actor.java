package Homework_02;
public abstract class Actor {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
        isMakeOrder = false;
        isTakeOrder = false;
    }

    abstract String getName();
}

