public class BottleOfWother extends Product{

    private double volume;
    public BottleOfWother(String name, double cost, double volume){
        super(name, cost);
        this.volume = volume;
    }
    public double getVolume(){
        return volume;
    }

    public void setVolume(double volume){
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWother{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() + '\'' +
                ", volume=" + volume +
                '}';
    }
}
