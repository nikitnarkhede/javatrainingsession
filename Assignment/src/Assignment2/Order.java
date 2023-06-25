package Assignment2;

import java.time.LocalDate;
import java.util.Set;

public class Order {
    private int id;
    public LocalDate orderDate;
    private LocalDate deliveryDate;
    private String status;
    //@ManyToOne
    private Customer customer;
    Set<Product> products;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", status='" + status + '\'' +
                ", customer=" + customer +
                ", products=" + products +
                '}';
    }

    public Order(int id, LocalDate orderDate, LocalDate deliveryDate, String status, Customer customer, Set<Product> products) {
        this.id = id;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.customer = customer;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Set<Product> getProducts() {
        return products;
    }
}
