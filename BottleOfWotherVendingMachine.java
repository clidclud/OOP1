import java.util.ArrayList;
import java.util.List;

public class BottleOfWotherVendingMachine implements VendingMachine {
    private List<BottleOfWother> bottleOfWothers = new ArrayList<>();

    @Override
    public void initsProduct(List<Product> productList) {
        for (Product i : productList) {
            bottleOfWothers.add((BottleOfWother) i);
        }
    }

    @Override
    public Product getProduct(String name) {
        for (BottleOfWother i : bottleOfWothers){
            if(i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }

    public Product getProduct(String name, double volume){
        for (BottleOfWother i : bottleOfWothers){
            if(i.getName().equals(name) && volume == i.getVolume()){
                return i;
            }
        }
        return null;
    }
}
