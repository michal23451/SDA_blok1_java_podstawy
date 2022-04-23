package pl.sdacademy.java.basic.day4;

import java.util.Locale;

/*
1. Stwórz metodę, która będzie przyjmować dwa parametry typu String, zamieniać je na duże litery, łączyć i wyświetlać na konsoli
2. Stwórz metodę która będzie zwracała zawsze pierwszy znak z podanego jako argument ciągu znaków.
3. Napisz program, który zmieni w łańcuchu „matematyka” wszystkie litery „a” na znak „*”
 */

public class StringExercices {
    //1
    public void changeString(String a, String b) {
        String result = a + " " + b;
        result = result.toUpperCase();
        System.out.println(result);
    }
    //2
    public char returnFirstChar(String sencence) {
        return sencence.charAt(0);
    }

    //3
    public String replaceAllLetterA(String sentence){
        return sentence.replaceAll("a","*");
    }

}
