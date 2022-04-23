package pl.sdacademy.java.basic.day5;
/*
1. Stwórz klasę z statycznym polem np. yearOfBirth. Stwórz kilka obiektów tej klasy i zainicjalizuj to pole różnymi wartościami – wydrukuj w konsoli wartości tych pól – czy jesteś w stanie wyjaśnić dlaczego utrzymaliśmy taki rezultat?
2. Powyższe odwołanie się do statycznej składowej nie jest zgodny z dobrą praktyką – przerób je, odwołaj (i zainicjalizuj) się do zmiennej w sposób statyczny.
 */
public class Birth {
    private static int yearOfBirth;



    public Birth(int yearOfBirth) {
        //poniższe zadziała, ale nie jest zgodne z dobrą praktyką dla zmiennych statycznych
        //this.yearOfBirth = yearOfBirth;
        Birth.yearOfBirth = yearOfBirth;
    }

    public static int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void setYearOfBirth(int yearOfBirth) {
        Birth.yearOfBirth = yearOfBirth;
    }
}
