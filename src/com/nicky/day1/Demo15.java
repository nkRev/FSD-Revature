package com.nicky.day1;

class Book {
    public String title;
    public String author;
    public int price;
    //created my own print info method to call instead of doing print lines in main
    public void printInfo() {
        System.out.println("This is print info method:\n" + "Book: Title: " + title + ", Author: " + author + ", Price: " + price+"\n");
    }
    //this toString will build my string similar to printInfo() but it requires me to use print lines in my main
    @Override
    public String toString() {
        return String.format("Book: Title: %s, Author: %s, Price: %d\n", title, author, price);
    }
}

public class Demo15 {
    public static void main(String[] args) {
        //instantiate new book object from book class
        Book book1 = new Book();
        //declare book object's variable
        book1.title = "Java";
        book1.author = "Author 1";
        book1.price = 100;
        //used toString
        System.out.println(book1.toString());
        book1.printInfo();

        Book book2 = new Book();
        book2.title = "Angular";
        book2.author = "Author 2";
        book2.price = 200;
        System.out.println(book2.toString());
        book2.printInfo();

        Book book3 = new Book();
        book3.title = "Python 3";
        book3.author = " author 3";
        book3.price = 1000;
        book3.printInfo();
    }
}
