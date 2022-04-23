package pl.sdacademy.java.basic.day3;

public class Person {
    /*
   modyfikatory dostępu:
   private - dostępny w ramach danej klasy
   public - dostępny poza pakietem (w ramach projektu
   bez modyfikatora - dostępny w ramach pakietu

     */

    public String firstName, lastName;
    public int age;
    public long pesel;

    //konstruktor - musi być tej samej nazwy co nazwa klasy!
    //jeśli utworzymy konstruktor paramerowy to przestanie nam działać bezparametrowy niejawny czyli Person x = new Person();
    // this pozwala nam odróżnić nazwę pola od nazwy parametru
    // this pozwala też wywoływać konsruktor (o mniejszej ilości parametrów) w innym konstuktorze - przeciążanie konstruktorów
    //nie może być dwóch konstuktorów z parametrami o tym samym typie, tej samej liczbie parametrów i tej samej kolejności
    public Person (String firstName, int age){
        this.firstName = firstName;
        this.age = age;
    }

    //jeśli zmienimy nazwy parametrów to można powyższy konstuktor zapisać tak (bez this):
    //public Person (String a, int b){
    //    firstName = a;
    //    age = b;
   // }

   // public Person (String firstName, String lastName, int age) {
    //    this.firstName = firstName;
    //    this.lastName = lastName;
    //    this.age = age;
   // }

    //zamiast powyższego możemy użyć konstuktora w konstruktorze, czyli użyliśmi utworzonego konstuktora dwuparametrowego
    public Person (String firstName, String lastName, int age) {
        this(firstName,age); //używamy utrzonego wcześniej kostruktora
        this.lastName = lastName;

    }



    //ponieważ stworzyliśmy konstruktor powyższy, to możemy też utworzyć bezparametrowy jawny jeśli potrzebujemy (niejawny przesaje działać bo utworzyliśmy powyższy)
    public Person () {};

    //konstruktor bezparamerowy
}
