package Task01;

public class HotDrink {
    private String name;
    private Integer cost;
    private Integer volume;

    public HotDrink(String name, Integer cost, Integer volume) {
        this.name = name;
        this.cost = cost;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public String getInfo() {
        return String.format("Name: %s, cost: %d, volume: %d", name, cost, volume);
    }
}
