package Assignment2;

import java.util.Set;

public class Product {
    private Long id;
    private String name;
    private String category;
    private Double price;
    //@ManyToMany(mappedBy = "products")
    private Set<Order> orders;

    public Product(long id, String name, String category, Double price){
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;


    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    public Set<Order> getOrders() {
        return orders;
    }
}
