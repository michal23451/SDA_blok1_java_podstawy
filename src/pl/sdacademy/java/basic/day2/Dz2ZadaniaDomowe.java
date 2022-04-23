package pl.sdacademy.java.basic.day2;

import java.util.Scanner;

public class Dz2ZadaniaDomowe {

    public static void main(String[] args) {
        /*
        //1.	Zadeklaruj i zainicjalizuj zmienną typu int. Dla danej liczby sprawdź, czy jest ona liczbą pierwszą. Wyświetl w konsoli komunikat, potwierdzający lub zaprzeczający.
        int myVariable = 15485863; //15485863
        boolean checkPrimeNumber;

        if (myVariable<2) {
            checkPrimeNumber = false;
        }
        else {
            checkPrimeNumber = true;
            for(int i=2; i <= myVariable/2; i++) { //wystarczy nawet sprawdzać do pierwiastka z myVariable
                if(myVariable%i == 0) {
                    checkPrimeNumber = false;
                    break;
                }
            }
        }


        if(!checkPrimeNumber)
            System.out.println("Liczba " + myVariable + " nie jest liczbą pierwszą");
        else
            System.out.println("Liczba " + myVariable + " jest liczbą pierwszą");
        */
        /*
        //2.	Napisz program, który dla zadanych dwóch zmiennych X i Y obliczy sumę liczb od X do Y.
        int myVariable = 4;
        int myVariable2 = 10;
        if (myVariable>myVariable2) {
            System.out.println("Pierwsza z podanych liczb musi być mniejsza od drugiej");
        }
        else {
            int sum = 0;
            for (int i=myVariable; i <= myVariable2; i++) {
                sum += i;
            }
            System.out.println("Suma liczb od " + myVariable + " do " + myVariable2 + " wynosi " + sum);
        }
        */
        /*
        //3.	Dla podanego roku sprawdź, czy jest on przestępny.
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Podaj rok, aby sprawdzić czy jest przestępny: ");
        //int year = myScanner.nextInt();
        int year = 2020;

        if (year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
            System.out.println("Rok " + year + " jest przestępny.");
        }
        else {
            System.out.println("Rok " + year + " nie jest przestępny.");
        }

        myScanner.close();
        */


        /*
        //4.	 Stwórz tablicę (4-elementową) liczb zmiennoprzecinkowych np. double. Porównaj 1 element z ostatnim.
        //a) Jeśli element 1 jest większy od 4 wydrukuj w konsoli odpowiedni komunikat.
        //b) Jeśli elementy są równe, wyświetl w konsoli komunikat odpowiedni komunikat
        //c) Jeśli element 4 w tablicy jest większy od elementu 1 w tablicy wyświetl w konsoli odpowiedni komunikat
        //WAŻNE: Powyższe warianty przetestuj dla kilku liczb


        double [] myArray = new double[]{5,9,17,84};
        if (myArray[0] > myArray[3]) {
            System.out.println("Element 1 jest większy od 4.");
        }
        else if (myArray[0] == myArray[3]) {
            System.out.println("Element 1 jest równy z 4.");
        }
        else if (myArray[3] > myArray[0]) {
            System.out.println("Element 1 jest mniejszy od 4.");
        }

        */


        /*
        //5.	Stwórz dwie zmienne typu int (a i b) – zainicjalizuj je przy pomocy klasy Scanner.
        //a) Sprawdź czy zmienna a jest większa od b.
        //b) Za pomocą skróconych operatorów dodaj do nich 10


        Scanner myScanner = new Scanner(System.in);
        System.out.println("Podaj zmienną a: ");
        int a = myScanner.nextInt();
        System.out.println("Podaj zmienną b: ");
        int b = myScanner.nextInt();

        if (a > b) {
            System.out.println("Zmienna a jest większa od b.");
        }
        else if (a < b){
            System.out.println("Zmienna a jest mniejsza od b.");
        }

        a+=10;
        b+=10;
        System.out.println("Zmienna a+10=" + a + ", zmienna b+10=" + b);

        myScanner.close();
        */

        /*
        //6.	Stwórz tablice z liczbami zmiennoprzecinkowymi (np. 5 elementów) – oblicz sumę, różnicę, iloczyn i iloraz wszystkich elementów. Użyj w tym celu pętli i klasy Scanner.

        double[] myArray2 = new double[5];

        //uzupełniamy tablicę
        for (int i = 0; i < myArray2.length; i++) {
            System.out.print("Podaj element " + (i+1) + " tablicy: ");
            myArray2[i] = myScanner.nextDouble();
        }

        //wyświetlamy zawartość tablicy
        System.out.print("Zawartość tablicy: ");
        for (int i = 0; i < myArray2.length; i++) {
            if (i < myArray2.length-1) {
                System.out.println(myArray2[i] + " ");
            }
            if (i == myArray2.length-1) {
                System.out.println(myArray2[i]);
            }
        }

        double  sum = 0, difference = 0, product = 1, quotient = 0;
        for (int i = 0; i < myArray2.length; i++) {
            //dodawanie
            sum += myArray2[i];
            //odejmowanie
            if (i == 0) { //przypisujemy pierwszą liczbę, żeby od niej później odejmować
                difference = myArray2[i];
            }
            else {
                difference -= myArray2[i];
            }
            //mnożenie
            product = myArray2[i] * product;
            //dzielenie
            if (i == 0) { //przypisujemy pierwszą liczbę, żeby później ją dzielić
                quotient = myArray2[i];
            }
            else {
                quotient = quotient / myArray2[i];
            }
        }
        System.out.println("Suma= " + sum);
        System.out.println(("Różnica= " + difference));
        System.out.println(("Iloraz= " + product));
        System.out.println(("Iloczyn= " + quotient));

        myScanner.close();
        */



        /*
        //7.	Napisz program, który będzie pobierał od użytkownika zadaną ilość liczb np. 5, następnie obliczy sumę wszystkich wprowadzonych liczb i wynik drukował w konsoli. Użyj klasy Scanner
        int counter = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Ile liczb chcesz podać?: ");
        counter = myScanner.nextInt();
        double [] myArray5 = new double[counter];
        for (int i = 0; i < myArray5.length; i++) {
            System.out.print("Podaj element " + (i+1) + " tablicy: ");
            myArray5[i] = myScanner.nextDouble();
        }

        System.out.print("Zawartość tablicy: ");
        for (int i = 0; i < myArray5.length; i++) {
            System.out.print(myArray5[i] + "   ");
        }


        double sum= 0 ;
        for (int i = 0; i < myArray5.length; i++) {
            sum += myArray5[i];
        }
        System.out.print("\nSuma: " + sum);

        myScanner.close();
        */

         /*
        //8.	Wypisz liczby od 1 do 5 i umieść je w tablicy (użyj klasy Scanner). Dla każdej z nich wypisz również jej wartość podniesioną do kwadratu. Nowe wartości podniesione do kwadratu, umieść w drugiej tablicy i wyświetl.
        int number;
        int[] inArray = new int[5];
        int[] outArray = new int[5];
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Podaj 5 liczb oddzielonych spacjami: ");
        for (int i = 0; i < inArray.length; i++){
            number = myScanner.nextInt();
            inArray[i] = number;
            outArray[i] = number*number;
        }

        System.out.print("Zawartośc tabeli: ");
        for (int i = 0; i < inArray.length; i++){
            System.out.print(inArray[i] + "   ");
        }
        System.out.print("\nZawartośc tabeli do kwadratu: ");
        for (int i = 0; i < inArray.length; i++){
            System.out.print(outArray[i] + "   ");
        }

        myScanner.close();
        */



        //9.	Stwórz tablicę z 10 elementami (może być na sztywno zapisana w kodzie). Posortuj tablicę rosnąco, wydrukuj posortowaną zawartość tablicy. WAŻNE: nie używaj metod z Klasy Arrays – napisz własny algorytm.

        int[] myArray3 = new int[]{7, 8, -3, 2, 4, 2, 9, 5, 5, 1 };
        //int[] myArray3 = new int[]{2, 2, 2, 1, 3, 3, 3, 3, 3, 3 };
        //int[] myArray3 = new int[]{77, 55, 2, 1, 3, 3, 3, 3, 3, 3 };
        //int[] myArray3 = new int[]{1, 77, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.print("\n\nZawartość nieposortowanej tablicy: \t");
        for (int i = 0; i < myArray3.length; i++) {
            System.out.print(myArray3[i] + "   ");
        }

        int temp = 0;

        //1 sposób
        for (int i = 0; i < myArray3.length; ) {
            if (i+1 < myArray3.length && myArray3[i] > myArray3[i+1]) { //warunek i+1 < myArray3.length jest po to, żebyśmy mogli porównywać z i+1 i nie wyjść za rozmiar tabeli
                //wyświetlamy
                //System.out.print("\nprzed 1 if - i=" + i + "     \t");
                //for (int x = 0; x < myArray3.length; x++) {
                //    System.out.print (myArray3[x] + "   ");
                //}
                temp = myArray3[i];
                myArray3[i] = myArray3[i+1];
                myArray3[i+1] = temp;
                i = 0; //porównujemy od początku
                //wyświetlamy
                //System.out.print("\npo 1 if - i=" + i + "     \t\t");
                //for (int x = 0; x < myArray3.length; x++) {
                //    System.out.print (myArray3[x] + "   ");
                //}
            }
            else {
                //wyświetlamy
                //System.out.print("\nprzed 2 el - i=" + i + "     \t");
                //for (int x = 0; x < myArray3.length; x++) {
                //    System.out.print (myArray3[x] + "   ");
                //}
                i++;
                //wyświetlamy
                //System.out.print("\npo 2 el - i=" + i + "     \t\t");
                //for (int x = 0; x < myArray3.length; x++) {
                //    System.out.print (myArray3[x] + "   ");
                //}
            }
        }


        //wyświetlamy
        System.out.print("\nZawartość posortowanej tablicy v1: \t");
        for (int i = 0; i < myArray3.length; i++) {
            System.out.print(myArray3[i] + "   ");
        }


        //2 sposób
        myArray3 = new int[]{7, 8, -3, 2, 4, 2, 9, 5, 5, 1 };
        for (int i = 0; i < myArray3.length - 1; ) {
            for (int j = 1; j < myArray3.length; ) {
                if (myArray3[i] > myArray3[j]) {
                    temp = myArray3[j];
                    myArray3[j] = myArray3[i];
                    myArray3[i] = temp;
                    i = 0;
                    j = 1;

                    //wyświetlamy
                    //System.out.print("1 if - i   j: " + i + "   " + j + ": ");
                    //for (int x = 0; x < myArray3.length; x++) {
                    //    System.out.print (myArray3[x] + "   ");
                    //}
                    //System.out.println();

                }
                else if (myArray3[i] <= myArray3[j]) {
                    i++;
                    j++;

                    //wyświetlamy
                    //System.out.print("2 ei - i   j: " + i + "   " + j + ": ");
                    //for (int x = 0; x < myArray3.length; x++) {
                    //    System.out.print(myArray3[x] + "   ");
                    // }
                    //System.out.println();

                }
            }
        }

        //wyświetlamy
        System.out.print("\nZawartość posortowanej tablicy v2: \t");
        for (int i = 0; i < myArray3.length; i++) {
            System.out.print(myArray3[i] + "   ");
        }

        //3 sposób - na podstawie algorytmu z internetu
        myArray3 = new int[]{7, 8, -3, 2, 4, 2, 9, 5, 5, 1 };
        for (int i = 0; i < myArray3.length - 1; i++ ) { //System.out.println("FOR1 i:" +i);
            for (int j = 0; j < myArray3.length - 1; j++ ) { //System.out.println("FOR2 i:" +i +"   j:" +j);
                if (myArray3[j] > myArray3[j+1]) {
                    temp = myArray3[j];
                    myArray3[j] = myArray3[j+1];
                    myArray3[j+1] = temp;
                }
            }
        }
        //wyświetlamy
        System.out.print("\nZawartość posortowanej tablicy v3: \t");
        for (int i = 0; i < myArray3.length; i++) {
            System.out.print(myArray3[i] + "   ");
        }




        /*
        //10.	 Napisz pętlę, która zakończy swoje działanie dopiero gdy użytkownik poda liczbę 0. Po każdym obrocie pętli powinna się wyświetlić informacja: „Wprowadziłeś liczbę: <liczba>”. Wprowadź 0, żeby zakończyć działanie programu. Gdy użytkownik wprowadzi liczbę 0, pętla powinna zakończyć swoje działanie i wydrukować w konsoli: „Koniec działania pętli”

        //wersja z do while
        int myInt;
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.print("Podaj liczbę: ");
            myInt = myScanner.nextInt();
            System.out.print("Wprowadziłeś liczbę " + myInt + ".\n");

            if(myInt == 0) {
                System.out.print("Koniec działania pętli.");
            }

        } while (myInt != 0);

        myScanner.close();
        */

    }
}
