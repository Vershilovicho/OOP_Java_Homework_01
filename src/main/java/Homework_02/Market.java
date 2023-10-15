package Homework_02;
import java.util.List;
import java.util.ArrayList;

public class Market implements QueueBehaviour, MarketBehaviour{
    private final List<Human> queue;

    public Market() {
        queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Human human) {
        System.out.println(human.getName() + " пришел в магазина");
        takeQueue(human);

    }

    @Override
    public void releaseFromMarket(List<Human> humans) {

    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();

    }

    @Override
    public void takeQueue(Human human) {
        System.out.println(human.getName() + " встал в очередь");
        queue.add(human);


    }

    @Override
    public void takeOrders() {
        for (Human human : queue) {
            if (!human.isMakeOrder()) {
                human.setMakeOrder();
                System.out.println(human.getName() + " сделал заказ");
            }
        }

    }

    @Override
    public void giveOrders() {

    }

    @Override
    public void releaseFromQueue() {
        List<Human> releaseActors = new ArrayList<>();
        for (Human human : queue) {
            if (human.isTakeOrder) {
                releaseActors.add(human);
                System.out.println(human.getName() + " вышел из очереди");
            }
        }
        releaseFromMarket(releaseActors);
    }
}
