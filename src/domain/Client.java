package domain;

public class Client {

    private Order[] orders;

    private String name;
    
    public Client(String n){
        this.name = n;
    }

    public Order createOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Order remoteOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
