package pl.sdacademy.java.basic.day5;
/*
1. Stwórz klasę z statycznym polem np. yearOfBirth. Stwórz kilka obiektów tej klasy i zainicjalizuj to pole różnymi wartościami – wydrukuj w konsoli wartości tych pól – czy jesteś w stanie wyjaśnić dlaczego utrzymaliśmy taki rezultat?
2. Powyższe odwołanie się do statycznej składowej nie jest zgodny z dobrą praktyką – przerób je, odwołaj (i zainicjalizuj) się do zmiennej w sposób statyczny.
 */
public class BirthMain {
    public static void main(String[] args) {

        Birth a = new Birth(1990);
        Birth b = new Birth(2000);
        Birth c = new Birth(2010);

        System.out.println(a.getYearOfBirth());
        System.out.println(b.getYearOfBirth());
        System.out.println(c.getYearOfBirth());

        //powyższe wywołania nie są prawidłowe (ale zadziałają), do zmiennych statycznych odwołujemy się poprzez nazwę klasy a nie obiektu:
        System.out.println(Birth.getYearOfBirth());
    }
}
