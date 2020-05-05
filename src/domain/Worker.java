package domain;

public class Worker {

    private String name;

    private Order[] completedorders;
    
    public Worker(String n){
        this.name = n;
    }

    public void addcompleteorder(Order order) {
    }

    public void cancelOrder(Order order) {
    }
}
