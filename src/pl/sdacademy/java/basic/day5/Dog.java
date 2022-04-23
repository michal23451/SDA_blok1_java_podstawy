package pl.sdacademy.java.basic.day5;
/*
3. Utwórz program składający się z dwóch klas:
- pozwala przechowywać informację o imieniu, rasie i wieku  - klasa z metodą main, w której utworzysz kilka (co najmniej 2 psy).
W klasie Dog zdefiniuj pole statyczne, która wraz z tworzeniem nowego obiektu tej klasy będzie zwiększane o 1, a tym samym pozwoli
śledzić liczbę psów np. w schronisku. Po utworzeniu co najmniej dwóch psów w klasie schelter, wyświetl liczbę psów w schronisku.
Do utworzenia obiektów użyj klasy Scanner.
 */
public class Dog {
    private String name;
    private String race;
    private int yearOfBirth;
    public static int counter;

    public Dog (String name, String race, int yearOfBirth) {
        this.name = name;
        this.race = race;
        this.yearOfBirth = yearOfBirth;
        counter++;
    }
}
