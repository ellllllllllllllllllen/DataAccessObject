package edu.epam.zavadskaya.service;

import edu.epam.zavadskaya.entity.Book;
import edu.epam.zavadskaya.entity.Shop;
import edu.epam.zavadskaya.exception.FailedToAddBookException;
import edu.epam.zavadskaya.exception.FailedToRemoveBookException;

import java.util.ArrayList;
import java.util.List;

public class BookService{

//    public BookService(List<Book> books) {
//        super(books);
//    }

    //добавить книгу в хранилище в случае, если такой книги нет, в противном случае генерировать исключение; (dao)

//    public void add(List<Book> books, Book book){
//        try{
//            books.add(book);
//        }catch (FailedToAddBookException ex){
//            //logger error
//        }
//    }

    //удалить книгу, если она есть, в противном случае генерировать исключение; (dao)

//    public void remove(List<Book> books, Book book){
//        try {
//            books.remove(book);
//
//        }catch (FailedToRemoveBookException ex){
//            //logger error
//        }
//    }

    //изменить книгу по заданным полям/полю; (dao)

    //найти книгу по заданному/ым критерию; (dao)
    public List<Book> search(Shop books, Book book){
        List<Book> searchedBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (book.equals(books.getBook(i).getBookId())) {
                searchedBooks.add(books.getBook(i));
            }
        }
        return searchedBooks;

    }

}
