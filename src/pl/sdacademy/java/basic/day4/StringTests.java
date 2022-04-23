package pl.sdacademy.java.basic.day4;

public class StringTests {

    public static void main(String[] args) {
        String name = "Wiktor";
        String fatherName = "Wiktor"; // nie tworzy nowej zmiennej, tylko referencja fatherName wskazuje na tem sam obiekt co referencja name (tzw. internowanie, pula stringów)
        String otherName = new String("Wiktor"); //taka konstukcja tworzy nowy obiekt (w odróżnieniu od powyższego);

        System.out.println(name == fatherName); //sprawdza czy faktyczznie wskazują na ten sam obiekt w pamięci

        name = "Wiktor";
        fatherName = "Wiktor";
        name = name.toUpperCase();
        //System.out.println(fatherName);
        System.out.println(name == fatherName); //sprawdza czy faktyczznie wskazują na ten sam obiekt w pamięci

        //łączenie stringów (konkatenacja)
        String lastName = "Kowalski";
        System.out.println(name + " " +lastName);
        String fullname = name + " " +lastName;
        System.out.println(fullname);

        //porównywanie obiektów (nie tylko tekstów) - metoda equals (metoda equals porównuje referencję czyli miejsce w pamięci, a nie zawartość string-a lub innych klas). do porównywania obiektów klas można nadpisać metodę equals własną
        System.out.println("equals");
        String text1 = "Text to campare";
        String text2 = "Text to campare";
        System.out.println(text1.equals(text2));
        int a=2, b=2;
        System.out.println(a==b);
        text1="aaa";
        text2="bbb";
        System.out.println(text1 == text2);
        System.out.println("\n\n\n");

        //printf
        System.out.printf("100.0 / 3.0 = %5.2f", 100.0 / 3.0); //wynikiem będzie liczba zmiennoprzecinkowa składająca się z 5-ciu znaków i 2 cyfr po przecinku
        System.out.println();
        System.out.printf("100 / 3 = %4d", 100 / 3); // wynikiem będzie liczba całkowita zajmująca 4 znaki - wynik dzielenia będzie zaokrąglony


    }
}

