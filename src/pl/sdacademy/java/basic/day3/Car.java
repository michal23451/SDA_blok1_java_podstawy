package pl.sdacademy.java.basic.day3;

public class Car {
    private String brand;
    private String model;
    private int year;

    //konstruktor
    public Car (String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }


    //settery
    public void setBrand (String brand){
        this.brand = brand;
    }

    public void setModel (String model){
        this.model = model;
    }

    public void setYear (int year){
        this.year = year;
    }

    //gettery
    public String getBrand () {
        return brand;
    }

    public String getModel () {
        return model;
    }

    public int getYear() {
        return year;
    }

}
