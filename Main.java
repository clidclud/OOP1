import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Product> bottleOfWothers = new ArrayList<>();
//        bottleOfWothers.add(new BottleOfWother("123",123,123));
//        bottleOfWothers.add(new BottleOfWother("231",231,231));
//        bottleOfWothers.add(new BottleOfWother("123",312,312));
//        BottleOfWotherVendingMachine bottle = new BottleOfWotherVendingMachine();
//        bottle.initsProduct(bottleOfWothers);
//        System.out.println(bottle.getProduct("123", 312));

        List<Product> hotDrink = new ArrayList<>();
        hotDrink.add(new HotDrink("Butterbeer from Harry Potter", 500,70));
        hotDrink.add(new HotDrink("Non-alcoholic mulled wine", 500,71));
        hotDrink.add(new HotDrink("Sea buckthorn tea", 500,72));
        System.out.println(hotDrink);

        HotDrinksVendingMachine hotDr = new HotDrinksVendingMachine();
        hotDr.initsProduct(hotDrink);
        System.out.println(hotDr.getProduct("Butterbeer from Harry Potter", 70));
    }
}
