package domain;

public class Order {

    private Dish[][] dishes;

    private Client Orderer;

    private short id;

    public Order(short id, Client Orderer) {
    }

    public Dish addDish(Dish dish) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Dish remoteDish(Dish dish) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getOrderPrice() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
