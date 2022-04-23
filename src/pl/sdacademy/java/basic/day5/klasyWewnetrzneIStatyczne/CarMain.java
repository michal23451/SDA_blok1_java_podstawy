package pl.sdacademy.java.basic.day5.klasyWewnetrzneIStatyczne;

public class CarMain {
    public static void main(String[] args) {
        Car.Engine engine = new Car().new Engine("V8");
        engine.refuel();

        //klasy statyczne
        Car.staticEngine statEng = new Car.staticEngine("V8");
        statEng.refuel();
    }
}
