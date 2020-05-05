package domain;

public class Dish {

    private double price;

    private String name;

    private String description;

    private short id;

    public Dish(double price, String name, String description, short id) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public short getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
