package pl.sdacademy.java.basic.day3;

import pl.sdacademy.java.basic.day3.package1.Samochod;
import pl.sdacademy.java.basic.day3.package1.CarPackage1;
import pl.sdacademy.java.basic.day3.package1.Test;
import pl.sdacademy.java.basic.day3.package2.PersonPackage2;
//zmienna statyczna - dostępna bez tworzenia obiektów klasy
import static pl.sdacademy.java.basic.day3.package2.ZmiennaStatyczna.staticVariable;


public class PackageMain {
    public static void main(String[] args) {
        CarPackage1 myCar = new CarPackage1("aaa","bbb",1990);
        PersonPackage2 myPerson = new PersonPackage2();

        //ta sama nazwa klas w różnych pakietach:
        Test test1 = new Test();
        pl.sdacademy.java.basic.day3.package2.Test test2 = new pl.sdacademy.java.basic.day3.package2.Test();

        Samochod myCar2 = new Samochod("Opel","Astra");
        Samochod myCar3 = new Samochod("Porsche","911");

        System.out.println(myCar3.getMarka());
        myCar2.setMarka("Ferrari");
        System.out.println(myCar2.getMarka());


        //zmienne statyczne
        System.out.println(staticVariable);


        //sprawdzanei czy obiekty są danego typu
        boolean isSamochod = (Object) myCar instanceof Samochod ;
        System.out.println(isSamochod);
        isSamochod =  myCar3 instanceof Samochod ;
        System.out.println(isSamochod);

        Object x = myCar;
        isSamochod =  x instanceof Samochod ;
        System.out.println(isSamochod);










    }
}
