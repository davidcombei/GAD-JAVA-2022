package lab4.decorator;

public abstract class Beverage {
    private int cost;
    private String description;

    public Beverage(int cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public int getCost() {
        return this.cost;
    }

    public String getDescription() {
        return this.description;
    }
}
