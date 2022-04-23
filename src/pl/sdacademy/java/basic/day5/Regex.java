package pl.sdacademy.java.basic.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
*  WYRAŻENIA REGULARNE*
* */



public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abcde");  //wzór - wyrażenie regularne
        Matcher matcher = pattern.matcher("abcde"); //dopasowanie, sprawdzenei czy pasuje do wyrażenia regularnego
        System.out.println(matcher.matches());

        pattern = Pattern.compile("W+iktor"); // to co jest przed plusem, może wystąpić 1 lub więcej razy, plus dotyczy tylko poprzedzającego warunku
        matcher = pattern.matcher("WWWWiktor");
        System.out.println(matcher.matches());

        pattern = Pattern.compile("W*iktor"); // * oznacza, że może wystąpić 0 lub więcej razy
        matcher = pattern.matcher("iktor");
        System.out.println(matcher.matches());

        pattern = Pattern.compile("[Wi]*ktor"); // * oznacza, że Wi może wystąpić 0 lub więcej razy
        matcher = pattern.matcher("iktor");
        System.out.println(matcher.matches());

        pattern = Pattern.compile("[0-59]"); // cyfra od 0-5 lub 9
        matcher = pattern.matcher("8");
        System.out.println(matcher.matches());

        Pattern a = Pattern.compile("abcde");
        Matcher b = a.matcher("abcde");
        System.out.println(b.matches());
        System.out.println(b.find()); //poogoglować

    }
}
