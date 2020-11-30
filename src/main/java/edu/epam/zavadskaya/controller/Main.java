package edu.epam.zavadskaya.controller;

import edu.epam.zavadskaya.entity.*;
import edu.epam.zavadskaya.exception.FailedToAddBookException;
import edu.epam.zavadskaya.service.ShopService;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FailedToAddBookException {

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Book> books2 = new ArrayList<>();

        Shop shop = new Shop(books);
        Shop shop2 = new Shop(books2);

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
        Author author2 = new Author("Mia", "Andersen");
        book2.setAuthor(author2);
        PublishingHouse publishingHouse2 = new PublishingHouse("Delibri", Country.UK);
        book2.setPublishingHouse(publishingHouse2);
        book2.setYear(1835);
        book2.setNumberOfPages(140);
        BigDecimal price2 = new BigDecimal(12.6);
        book2.setPrice(price2);
        book2.setBindingtype(BindingType.SOFT);

        Book book3 = new Book();
        book3.setBookId(143256);
        book3.setTitle("Night");
        Author author3 = new Author("Marie", "Anderson");
        book3.setAuthor(author3);
        PublishingHouse publishingHouse3 = new PublishingHouse("Minsk", Country.BELARUS);
        book3.setPublishingHouse(publishingHouse3);
        book3.setYear(2000);
        book3.setNumberOfPages(200);
        BigDecimal price3 = new BigDecimal(20.10);
        book3.setPrice(price3);
        book3.setBindingtype(BindingType.HARD);


        Book book4 = new Book();
        book4.setBookId(123456);
        book4.setTitle("How to remain ever happy");
        Author author4 = new Author("Mark", "Gupta");
        book4.setAuthor(author4);
        PublishingHouse publishingHouse4 = new PublishingHouse("Gupta", Country.CANADA);
        book4.setPublishingHouse(publishingHouse4);
        book4.setYear(1995);
        book4.setNumberOfPages(260);
        BigDecimal price4 = new BigDecimal(14.97);
        book4.setPrice(price4);
        book4.setBindingtype(BindingType.SOFT);

        //books.add(book1);
        //books.add(book2);


        //books2.add(book3);
        ShopService shopService = new ShopService();

        shopService.add(shop, book1);
        shopService.add(shop, book2);
        shopService.add(shop, book3);
        //shopService.add(shop, book4);

        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("____________");

        System.out.println(author2.getName());
        System.out.println("____________");
        shopService.search(author2.getName(), shop);

        //shop.search(author2.getName(), shop);



    }
}
