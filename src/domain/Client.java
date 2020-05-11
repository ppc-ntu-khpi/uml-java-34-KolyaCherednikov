package domain;

public class Client {

    private Order[] orders;

    private short id;

    private String name;

    public Client(String n, short id) {
    }

    public Order createOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Order remoteOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
