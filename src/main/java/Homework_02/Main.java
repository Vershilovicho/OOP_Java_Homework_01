package Homework_02;
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Александр");
        human.setMakeOrder();
        human.setTakeOrder();
        human.isMakeOrder();
        System.out.println(human.isMakeOrder());
        human.isTakeOrder();
        System.out.println(human.isTakeOrder());
        task1();
    }

    public static void task1() {
        Market myMarket = new Market();
        System.out.println();
        myMarket.acceptToMarket(new Human("Сергей"));

        myMarket.update();

        myMarket.acceptToMarket(new Human("Артем"));
        myMarket.acceptToMarket(new Human("Валерий"));

        myMarket.update();


    }
}

