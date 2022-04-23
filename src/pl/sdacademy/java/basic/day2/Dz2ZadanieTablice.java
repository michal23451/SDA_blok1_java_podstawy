package pl.sdacademy.java.basic.day2;

public class Dz2ZadanieTablice {
    public static void main (String[] args){
        double [][] array = new double[3][3];
        array[0] = new double[]{1, 1.5, 2};
        array[1] = new double[]{1.5, 2, 2.5};
        array[2] = new double[]{2, 2.5, 3};



        System.out.println((array[0][0] * array[1][1] * array[2][2]) + (array[0][2] * array[1][1] * array[2][0])); //Sumę iloczynów przekątnych tablicy,
        System.out.println((array[1][0] + array[1][1] + array[1][2]) * (array[0][1] + array[1][1] + array[2][1])); //iloczyn sum środkowego wiersza i środkowej kolumny tablicy,
        System.out.println(array[0][0] + array[0][1] + array[0][2] + array[2][1] + array[2][2] + array[2][1] + array[2][0] + array[1][0]); //sumę wszystkich elementów znajdujących się przy krawędzi tablicy.




    }
}
