package pl.sdacademy.java.basic.day4.magazyn;

import java.util.Scanner;

public class Storage {
    private Product[] productArray;

    //konstuktor
    public Storage () {
        productArray = new Product[3];
    }
    //konstruktor do testowego uzupełniania tablicy
    /*public Storage (String name, int quantity){
        this(); //użyje powyższego konstuktora aby utworzyć 3elementową tablicę
        Product p = new Product(name, quantity);
        this.productArray[0] = p;
        this.productArray[1] = p;
        this.productArray[2] = p;
    }*/

    //szukamy pierwszego wolnego indeksu do wstawiania
    private int checkFreeIndex() {
        int firstFreeIndex = productArray.length; //jeżeli ta funkcja zwróci nam productArray.length, tzn. że cała tablica jest zapełniona danymi i użyjemy tej wartości do wyświetlenia odpowiedniego komunikatu
        for (int i = 0; i < productArray.length; i++) {
           if (productArray[i] == null) {
               firstFreeIndex = i;
               break;
           }
        }
        return firstFreeIndex;
    }

    //dodawanie na pierwszym wolnym indeksie
    public void addProduct() {
        int firstFreeIndex = checkFreeIndex();
        if (firstFreeIndex == productArray.length) {
            System.out.println("Nie ma już miejsca w tabeli");
        }
        else {
            System.out.println("Chcesz dodać produkt do magazynu w tabeli na indeksie: " + firstFreeIndex);
            Product p = new Product();
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Podaj nazwę produktu: ");
            p.setName(myScanner.nextLine());
            System.out.print("Podaj ilość produktu: ");
            p.setQuantity(myScanner.nextInt());
            myScanner.nextLine(); //konsumujemy znak nowej linii, na wszelki wypadek gdybyśmy później wczytywali tekst
            productArray[firstFreeIndex] = p;
        }
    }

    public void showStorage() {
        for (int i=0; i < productArray.length; i++) {
            if( productArray[i] != null) {
                System.out.println("Indeks: " + i + " Produkt i ilość: " + productArray[i].getName() + " " + productArray[i].getQuantity());
            }
            else { //testowo - wyświetli nulle w tablicy
                System.out.println("Indeks: " + i + ": " + productArray[i]);
            }
        }
    }

    public void delProduct() {
        System.out.println("Który produkt chcesz usunąć? Podaj indeks: ");
        Scanner myScanner = new Scanner(System.in);
        int delIndex = myScanner.nextInt();
        if (delIndex >= productArray.length) {
            System.out.println("Podano indeks poza zakresem!");
        }
        else {
            productArray[delIndex] = null;
        /*
        if (delIndex == productArray.length - 1) { //jeśli kasujemy ostatni element, to ustawiamy go na null i nie musimy "cofać" danych o jeden index w tablicy
            productArray[delIndex] = null;
        }
        else {
            for (int i = delIndex; i < productArray.length - 1; i++) { //"cofamy" produkty w tablicy o jeden indeks
                productArray[i] = productArray[i + 1];
            }
        }
         */

            //w sumie powyższy if i else nie są potrzebne, bo w linii 68 ustawiamy już element tablicy na null, więc ustawi nam też ostatni indeks bez konieczności cofania
            //aby cofnąć wszystko oprócz ostatniego indeksu wystarczy:
            for (int i = delIndex; i < productArray.length - 1; i++) { //"cofamy" produkty w tablicy o jeden indeks
                productArray[i] = productArray[i + 1];
                productArray[i + 1] = null; //bez tego np. przu usuwaniu indeksu 0 zostawały dane w ostatnim indeksie
            }
        }
    }


    public void addProductScannerVersion(Scanner myScanner) {
        int firstFreeIndex = checkFreeIndex();
        if (firstFreeIndex == productArray.length) {
            System.out.println("Nie ma już miejsca w tabeli");
        }
        else {
            System.out.println("Chcesz dodać produkt do magazynu w tabeli na indeksie: " + firstFreeIndex);
            Product p = new Product();
            System.out.print("Podaj nazwę produktu: ");
            p.setName(myScanner.nextLine());
            System.out.print("Podaj ilość produktu: ");
            p.setQuantity(myScanner.nextInt());
            myScanner.nextLine(); //konsumujemy znak nowej linii, na wszelki wypadek gdybyśmy później wczytywali tekst
            productArray[firstFreeIndex] = p;
        }
    }




}


