package pl.sdacademy.java.basic.day3.package1;

public class Samochod {
    private String marka;
    private String model;


    //konstuktor
    public Samochod (String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    //gettery i settery
    public void setMarka(String marka){
        this.marka = marka;
    }

    public String getMarka(){
        return this.marka;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    //metody
    public void wyswietl (){
        System.out.println("Samochód: " + marka + " " + model);
    }

}
