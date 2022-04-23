package pl.sdacademy.java.basic.day3;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        /*
        2. Stwórz klasę Book z polami author, title, price. Stwórz konstruktor 2 parametrowy i 3 parametrowy. W konstruktorze 3 - parametrowym wywołaj 2 – parametrowy.
        3. Spróbuj stworzyć obiekt klasy Book bez żadnych parametrów. Co się stanie i dlaczego? Co należy w takim przypadku zrobić?
        4. Stwórz klasę Factory z dowolonymi 2 polami – stwórz konstruktor, który będzie miał nazwy parametrów takie same jak pola Twoich klas. Co się stanie? Co należy w takiej sytuacji zrobić?
        5. Za pomocą klasy Scanner stwórz kilka obiektów typu Book (z zadania 2). Postaraj się aby program wyświetlał informację, o potrzebnej wartości od użytkownika. Za pomocą pętli wyświetl informację o tych obiektach w konsoli. Jeśli cena książki będzie wynosiła więcej niż 500 zł – wyświetl komunikat: Książka: <tytuł książki> jest bardzo droga!”
        * */


        Scanner myScanner = new Scanner(System.in);

        System.out.println("Podaj dane książki 1 (autor enter tytuł enter cena enter): ");
        Book myBook1 = new Book(myScanner.nextLine(), myScanner.nextLine(), myScanner.nextDouble());

        myScanner.nextLine();

        System.out.println("Podaj dane książki 2 (autor enter tytuł enter cena enter): ");
        Book myBook2 = new Book(myScanner.nextLine(), myScanner.nextLine(), myScanner.nextDouble());

        Book[] myArray = new Book[2];
        myArray[0] = myBook1;
        myArray[1] = myBook2;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]. author + " " + myArray[i].title + " " + myArray[i].price);
            if(myArray[i].price > 500) {
                System.out.println("Książka " + myArray[i].title + " jest bardzo droga!");
            }
        }

        //metody
        System.out.println("\n\n\n");
        myBook1.printName1();
        System.out.println(myBook1.getName());

        myBook2.printName("Marcin");


        //gettery i settery - pobieranie i ustawianie zmiennych private
        System.out.println("\n\n\n");
        Book myBook3 = new Book();
        myBook3.setAuthorPrivate("XXX");
        System.out.println(myBook3.getAuthorPrivate());


        myScanner.close();
    }
}
