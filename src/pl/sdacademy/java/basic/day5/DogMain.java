package pl.sdacademy.java.basic.day5;

import java.util.Scanner;

/*
3. Utwórz program składający się z dwóch klas:
- pozwala przechowywać informację o imieniu, rasie i wieku  - klasa z metodą main, w której utworzysz kilka (co najmniej 2 psy).
W klasie Dog zdefiniuj pole statyczne, która wraz z tworzeniem nowego obiektu tej klasy będzie zwiększane o 1, a tym samym pozwoli
śledzić liczbę psów np. w schronisku. Po utworzeniu co najmniej dwóch psów w klasie schelter, wyświetl liczbę psów w schronisku.
Do utworzenia obiektów użyj klasy Scanner.
 */
public class DogMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String race;
        int yearOfBirth;

        name = scanner.nextLine();
        race = scanner.nextLine();
        yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        Dog dog1 = new Dog(name, race, yearOfBirth);

        name = scanner.nextLine();
        race = scanner.nextLine();
        yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        Dog dog2 = new Dog(name, race, yearOfBirth);

        System.out.println("Liczba psów: " + Dog.counter);
    }




}
