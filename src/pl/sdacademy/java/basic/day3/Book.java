package pl.sdacademy.java.basic.day3;

public class Book {
    public String author, title;
    public double price;
    //gettery i settery
    private String authorPrivate;

    public Book (String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book (String author, String title, double price) {
        this (author, title);
        this.price = price;
        //można też dodać np. to co poniżej, wtedy przy tworzeniu obiektu wyświetli się info:
        //if(this.price > 500) {
        //    System.out.println("Książka " + this.title + " jest bardzo droga!");
        //}
    }

    public Book() {};

    //metody
    public void printName1 () {
        System.out.println("Krzysiek1");
    }

    public String getName() {
        return "Krzysiek2";
    }

    public void printName(String name) {
        System.out.println(name);
    }

    //gettery i settery
    public void setAuthorPrivate (String author) {
        this.authorPrivate = author;
    }

    public String getAuthorPrivate () {
        return this.authorPrivate;
    }
}
