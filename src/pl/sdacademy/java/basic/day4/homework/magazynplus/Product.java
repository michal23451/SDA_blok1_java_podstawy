package pl.sdacademy.java.basic.day4.homework.magazynplus;

public class Product {
    private String name; //nazwa
    private int quantity; //ilość

    //konstruktor
    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    public Product() {}

    //gettery i settery
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
