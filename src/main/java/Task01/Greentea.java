package Task01;

public class Greentea extends HotDrink {

    public Integer temperature;

    public Greentea(String name, Integer cost, Integer volume, Integer temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

}