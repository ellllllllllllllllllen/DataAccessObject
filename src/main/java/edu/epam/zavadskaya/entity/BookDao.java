package edu.epam.zavadskaya.entity;

import java.util.ArrayList;
import java.util.List;

public class BookDao implements BaseDao{
    private List<Book> books;

    private BookDao(){ }

    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
    }

    @Override
    public List<Book> findById(long id) {
        return null;
    }

    @Override
    public boolean delete(Book book) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public boolean create(Book book) {
        return false;
    }

    @Override
    public List<Book> update(Book book) {
        return null;
    }
}
