package Homework_02;


//Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования
//        Реализовать класс Market и все методы, которые он обязан реализовывать.
//        Методы из интерфейса QueueBehaviour, имитируют работу очереди,
//        MarketBehaviour – помещает и удаляет человека из очереди,
//        метод update – обновляет состояние магазина (принимает и отдаёт заказы)



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

