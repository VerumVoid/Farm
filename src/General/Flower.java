package General;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    public String getName() {
        return name;
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
