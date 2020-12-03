package edu.epam.zavadskaya.dao;

import edu.epam.zavadskaya.entity.Book;

import java.util.List;

public interface IShop {

    void addBook(Book book);
    void deleteBook(Book book);

    Book findById(Book book);
    List<Book> findByTitle(List<Book> books);
    List<Book> findByYear(List<Book> books);
    List<Book> findAll(List<Book> books);
}
