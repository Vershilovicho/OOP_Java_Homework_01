package Task01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HotDrink latte = new HotDrink("latte", 250, 250);
        HotDrink americano = new HotDrink("americano", 200, 250);
        HotDrink hotChocolate = new HotDrink("hotChocolate", 300, 250);
        List<HotDrink> mainGoods = new ArrayList<>();
        mainGoods.add(latte);
        mainGoods.add(americano);
        mainGoods.add(hotChocolate);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getProduct((ArrayList<HotDrink>) mainGoods);

        Greentea hotDrinkTea = new Greentea("green tea", 200, 250, 70);
        System.out.println(hotDrinkTea.getInfo());

        vendingMachine.getProduct("green tea", 250, 70);

    }
}



