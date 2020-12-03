package edu.epam.zavadskaya.dao;

import edu.epam.zavadskaya.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class Shop implements IShop {

    private static final Shop INSTANCE = new Shop();

    private ArrayList<Book> books = new ArrayList<>();

    public static Shop getInstance() {
        return INSTANCE;
    }

    private Shop() {
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void deleteBook(Book book) {
        books.remove(book);
    }

    @Override
    public Book findById(Book book) {
        return book;
    }

    @Override
    public List<Book> findByTitle(List<Book> books) {
        return books;
    }

    @Override
    public List<Book> findByYear(List<Book> books) {
        return books;
    }

    @Override
    public List<Book> findAll(List<Book> books) {
        return books;
    }
}



