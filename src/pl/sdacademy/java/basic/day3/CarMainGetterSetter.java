package pl.sdacademy.java.basic.day3;

public class CarMainGetterSetter {
    public static void main(String[] args) {

        /*
        * 1. Utwórz klasę Car z 3 prywatnymi polami – stwórz odpowiedni konstruktor i za jego pomocą stwórz obiekty w klasie z metodą main().
        * Napisz gettery i settery.
        * Zmodyfikuj stworzone wcześniej utworzone obiekty za pomocą settera. Wydrukuj w konsoli stan tych obiektów przed i po zmianie.
        * */



        Car car1 = new Car("Opel","Astra",2020);
        Car car2 = new Car("Renault","Megane", 2015);

        System.out.println(car1.getBrand() + " " + car1.getModel() + " " + car1.getYear());
        System.out.println(car2.getBrand() + " " + car2.getModel() + " " + car2.getYear());

        car1.setBrand("OOPPEELL");
        car2.setModel("MMEEGGAANNEE");

        System.out.println(car1.getBrand() + " " + car1.getModel() + " " + car1.getYear());
        System.out.println(car2.getBrand() + " " + car2.getModel() + " " + car2.getYear());

    }
}
