package General;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    public String getName() {
        return name;
    }

    public void water(){
        this.chanceOfGrowth += 0.1;
    }

    @Override
    public String toString() {
        return "General.Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

}
