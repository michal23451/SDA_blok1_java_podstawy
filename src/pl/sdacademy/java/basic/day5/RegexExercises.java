package pl.sdacademy.java.basic.day5;
/*

1. Napisz wyrażenie regularne, które sprawdzi czy użytkownik wprowadził imię w sposób poprawny.
2. Napisz wyrażenie regularne, które sprawdza czy liczba zmiennoprzecinkowa podana przez użytkownika ma poprawny format.
Na przykład liczba 151,4523423 czy -19 są poprawne ale 200-414 czy 565, już nie.
3. Napisz wyrażenie regularne, które będzie walidowało czy podane hasło ma kolejno:
dokładnie 4 litery ‘a’ na początku
Musi mieć przynajmniej 1 liczbę
Może ale nie musi mieć znaku ‘z’
Zawiera minimum 3 a maximum 5 znaków ‘j’
Kończy się jednym z znaków x lub y lub z



 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercises {
    public static void main(String[] args) {
        Pattern myPattern = Pattern.compile("[A-ZzżźćńółęąśŻŹĆĄŚĘŁÓŃ][a-zzżźćńółęąśŻŹĆĄŚĘŁÓŃ]{2,}"); //znaki specjalne - dodajemy [żźćńółęąśŻŹĆĄŚĘŁÓŃ]
        Matcher myMatcher = myPattern.matcher("Michał");
        System.out.println(myMatcher.matches());

        myPattern = Pattern.compile("-?[0-9]+(,[0-9]+)?");
        myMatcher = myPattern.matcher("2,");
        System.out.println(myMatcher.matches());

        myPattern = Pattern.compile("a{4}[0-9]+z*j{3,5}[xyz]");
        myMatcher = myPattern.matcher("aaaa56464zjjjjjx");
        System.out.println(myMatcher.matches());
        myMatcher.reset(); //musimy jeśli mamy find po matcher
        System.out.println(myMatcher.find()); //zwraca true jeśli w stringu znajdzie odpowiednik pasujący do wyrażenia regularnego

        myPattern = Pattern.compile("[a-z]*![a-z]*"); //musi być wykrzyknik w dowolnym miejscu
        myMatcher = myPattern.matcher("aaaaaa!");
        System.out.println(myMatcher.matches());


        System.out.println("\n\n");
        Pattern myPattern2 = Pattern.compile("[A-Z][A-Z][a-z]*");
        Matcher myMatcher2 = myPattern2.matcher("DAria");
        System.out.println(myPattern2);
        System.out.println(myMatcher2);
        System.out.println(myMatcher2.matches());

        myPattern2 = Pattern.compile("a[bc\\[\\]]");
        myMatcher2 = myPattern2.matcher("a]");
        System.out.println("\n\n" + myMatcher2.matches());

        myPattern2 = Pattern.compile("a.c");
        myMatcher2 = myPattern2.matcher("aXc");
        System.out.println("\n\n" + myMatcher2.matches());




    }
}
