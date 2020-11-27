package edu.epam.zavadskaya.entity;

import java.util.List;

public interface BaseDao {
    List<Book> findAll();
    List<Book> findById(long id);
    boolean delete(Book book);
    boolean delete(long id);
    boolean create(Book book);
    List<Book> update(Book book);

}
