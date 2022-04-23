package pl.sdacademy.java.basic.day3;

import java.util.Scanner;


public class Klasy {

    static String test1;
    static int test2;

    public static void main(String[] args) {
        System.out.println(test1);
        System.out.println(test2);


        /*
        1. Stwórz klasę Person z polami firstName, lastName, age, pesel. Stwórz na jej podstawie 2 obiekty w klasie z metodą main.
2. Sprawdź, która osoba jest starsza – wynik wydrukuj w konsoli.
3. Przypisz stworzone obiekty do tablicy, wydrukuj jej zawartość.
4. Stwórz dwa kolejne obiekty klasy Person i zainicjalizuj je za pomocą klasy Scanner. Przed wprowadzeniem np. imienia wyświetl komunikat „Podaj imię:” itd. dla kolejnych pól.
5. Sprawdź czy stworzone obiekty są typu Person. Wyświetl odpowiedni komunikat.
         */


        Person person1 = new Person();//konstrutor bezparametrowy - nie podajemy parametrów
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.age = 35;
        person1.pesel = 11223332120L;

        Person person2 = new Person();
        person2.firstName = "Adam";
        person2.lastName = "Nowak";
        person2.age = 50;
        person2.pesel = 11223332999L;

        if (person1.age > person2.age) {
            System.out.println("Sarszy jest " + person1.firstName + " " + person1.lastName);
        }
        else if (person1.age == person2.age) {
            System.out.println("Osoby są w takim samym wieku");
        }
        else if (person1.age < person2.age) {
            System.out.println("Sarszy jest " + person2.firstName + " " + person2.lastName);
        }

        Person[] myArray = new Person[2];
        myArray[0] = person1;
        myArray[1] = person2;

        System.out.println("\nZawartość tablicy: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i].firstName + " " + myArray[i].lastName);
        }


        Person person3 = new Person();
        Person person4 = new Person();

        Scanner myScanner = new Scanner (System.in);
        System.out.print("Podaj imię: ");
        person3.firstName = myScanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        person3.lastName = myScanner.nextLine();
        System.out.print("Podaj wiek: ");
        person3.age = myScanner.nextInt();
        System.out.print("Podaj pesel: ");
        person3.pesel = myScanner.nextLong();

        myScanner.nextLine(); //komsunujemy znak nowej linii po powyższej liczbie

        System.out.print("Podaj imię: ");
        person4.firstName = myScanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        person4.lastName = myScanner.nextLine();
        System.out.print("Podaj wiek: ");
        person4.age = myScanner.nextInt();
        System.out.print("Podaj pesel: ");
        person4.pesel = myScanner.nextLong();

        Person[] myArray2 = new Person[2];
        myArray2[0] = person3;
        myArray2[1] = person4;

        System.out.println("\nZawartość tablicy: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray2[i].firstName + " " + myArray2[i].lastName);
        }

        //sprawdzanei czy obiekty są danego typu
        boolean isPerson = person2 instanceof Person;
        System.out.println(isPerson);

        myScanner.close();
    }
}
