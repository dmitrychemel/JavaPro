package lesson7;

public class Order {
    int id;
    String customer;

    public Order(int id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                '}';
    }
}
