package com.nicky.day1;
class Book2 {
    private String title;
    private String author;
    private int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println("This is print info method:\n" + "Book: Title: " + getTitle() + ", Author: " + getAuthor() + ", Price: " + getPrice()+"\n");
    }
}
public class Demo16 {
    public static void main(String[] args) {
        Book2 book1 = new Book2();
        book1.setAuthor("author 1");
        book1.setTitle("Machine Learning");
        book1.setPrice(100);
        book1.printInfo();


    }
}
