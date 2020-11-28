package edu.epam.zavadskaya.controller;

import edu.epam.zavadskaya.entity.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        ArrayList<Book> books = new ArrayList<>();
        Shop shop = new Shop(books);

        Book book1 = new Book();
        book1.setBookId(123456);
        book1.setTitle("How to remain ever happy");
        Author author = new Author("Mark", "Gupta");
        book1.setAuthor(author);
        PublishingHouse publishingHouse = new PublishingHouse("Gupta", Country.CANADA);
        book1.setPublishingHouse(publishingHouse);
        book1.setYear(1995);
        book1.setNumberOfPages(260);
        BigDecimal price = new BigDecimal(14.97);
        book1.setPrice(price);
        book1.setBindingtype(BindingType.SOFT);

        Book book2 = new Book();
        book2.setBookId(123456);
        book2.setTitle("Fire");
        Author author2 = new Author("Gans", "Andersen");
        book2.setAuthor(author2);
        PublishingHouse publishingHouse2 = new PublishingHouse("Delibri", Country.UK);
        book2.setPublishingHouse(publishingHouse2);
        book2.setYear(1835);
        book2.setNumberOfPages(140);
        BigDecimal price2 = new BigDecimal(12.6);
        book2.setPrice(price);
        book2.setBindingtype(BindingType.SOFT);

        books.add(book1);
        books.add(book2);

        for (Book book : books) {
            System.out.println(book.toString());
        }

    }
}
