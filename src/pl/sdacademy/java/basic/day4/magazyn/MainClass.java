package pl.sdacademy.java.basic.day4.magazyn;

import java.util.Scanner;

/*
4. Napisz aplikację symulującą magazyn. Stwórz klasę, na podstawie której będziesz tworzył produkty, klasę odpowiedzialną za przechowywanie produktów oraz klasę główną.
Stwórz odpowiednie metody do dodawania, usuwania i drukowania produktów. Program może przechowywać maksymalnie 3 produkty. Jeśli użytkownik będzie chciał dodać 4 produkt,
 program powinien wydrukować komunikat: „Nie możesz dodać więcej niż 3 produkty”. Program powinien powitać użytkownika i poinformować o możliwych wariantach: wpisz np.
 0 – wyjście z programu, 1 – dodaj produkt, 2- usuń produkt, 3 – wydrukuj wszystkie produkty. Program powinien działać do momentu wprowadzenia 0 przez użytkownika.
 Na zakończenie, program powinien wydrukować napis: „Do widzenia!”
 */
public class MainClass {
    public static void main(String[] args) {
        runApp();

    }

    private static void runApp() {
        Storage myStorage = new Storage();
        int menu;
        do {
            System.out.println("********MENU**********");
            System.out.println("Podaj co chcesz zrobić:\n0 - wyjść z programu\n1 - dodaj produkt\n2 - usuń produkt\n3 - wydrukuj wszystkie produkty");
            Scanner scan = new Scanner(System.in);
            menu = scan.nextInt();
            scan.nextLine();

            switch (menu) {
                case 0:
                    System.out.println("Do widzenia!");
                    scan.close();
                    break;
                case 1:
                    //myStorage.addProduct();
                    myStorage.addProductScannerVersion(scan);
                    break;
                case 2:
                    myStorage.delProduct();
                    break;
                case 3:
                    myStorage.showStorage();
                    break;
                default:
                    System.out.println("Niepoprawny wybór!");
            }
            System.out.print("\n\n\n");

        } while (menu != 0);







    }
}
