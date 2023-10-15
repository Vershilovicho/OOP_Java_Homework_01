package Homework_02;
public class Human extends Actor implements ActorBehaviour {


    public Human(String name) {
        super(name);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
        System.out.println("Заказ принят");
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
        System.out.println("Заказ выдан");
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}

