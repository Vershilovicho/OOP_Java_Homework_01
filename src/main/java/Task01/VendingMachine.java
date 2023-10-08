package Task01;

import java.util.ArrayList;
import java.util.Iterator;

public class VendingMachine {

    public void getProduct(ArrayList<HotDrink> hotDrinks) {
        System.out.println("В наличии: ");
        Iterator<HotDrink> iterator = hotDrinks.iterator();
        while (iterator.hasNext())
        {
            HotDrink item = iterator.next();
            System.out.println(item.getName());
        }
    }

    public void getProduct(String name, int volume, int temperature) {
        System.out.printf("Горячий напиток: " + name + ", его температура составляет " + temperature + ", объем напитка: " + volume);
    }
}