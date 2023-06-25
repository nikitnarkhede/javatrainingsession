package Assignment2;

public class Customer {
    private int id;
    private String name;
    private Integer tier;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getTier() {
        return tier;
    }

    public Customer(int id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }
}
