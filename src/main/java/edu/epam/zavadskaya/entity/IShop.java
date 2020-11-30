package edu.epam.zavadskaya.entity;

import java.util.List;

public interface IShop<T, Book> {
    void addBook(Book book);
    void deleteBook(Book book);
    //    найти книгу по заданному/ым критерию; (dao)
    List<Book> search(T criterion, Shop shop);





//    изменить книгу по заданным полям/полю; (dao)
//    отсортировать список книг по заданному/ым критерию.(service/find)


//    List<Book> findAll();
//    List<Book> findById(long id);
//    boolean delete(Book book);
//    boolean delete(long id);
//    boolean create(Book book);
//    List<Book> update(Book book);

}
