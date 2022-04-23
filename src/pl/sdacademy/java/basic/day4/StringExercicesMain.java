package pl.sdacademy.java.basic.day4;

/*
1. Stwórz metodę, która będzie przyjmować dwa parametry typu String, zamieniać je na duże litery, łączyć i wyświetlać na konsoli
2. Stwórz metodę która będzie zwracała zawsze pierwszy znak z podanego jako argument ciągu znaków.
3. Napisz program, który zmieni w łańcuchu „matematyka” wszystkie litery „a” na znak „*”
 */

public class StringExercicesMain {
    public static void main(String[] args) {
        StringExercices myString = new StringExercices();

        String a = "Ala ma kota";
        String b = "a kot ma Alę.";

        myString.changeString(a, b);

        System.out.println("returnFirstChar: " + myString.returnFirstChar(a));
        System.out.println("replaceAllLetterA: " + myString.replaceAllLetterA("matematyka"));

    }


}
