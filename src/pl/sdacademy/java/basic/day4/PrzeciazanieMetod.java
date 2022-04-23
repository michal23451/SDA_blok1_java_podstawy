package pl.sdacademy.java.basic.day4;

public class PrzeciazanieMetod {

    //przeciązanie metod (podobnie jak przy konstuktorach) - metody o tych samych nazwach,
    //ale muszą mieć jako ragumenty różne typy, ilość lub kolejność
    //typ zwracany nie ma znaczenia
    int incrementNumber(int a) {
        return ++a;
    }
    void incrementNumber(String b) {
        System.out.println(b);
    }

    double incrementNumber(double c) {
        return ++c;
    }
}
