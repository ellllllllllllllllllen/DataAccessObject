package edu.epam.zavadskaya.service;

import edu.epam.zavadskaya.entity.Book;
import edu.epam.zavadskaya.exception.FailedToAddBookException;
import edu.epam.zavadskaya.exception.FailedToFindBookException;
import edu.epam.zavadskaya.exception.FailedToRemoveBookException;

public interface IShopService {
    void add(Book book) throws FailedToAddBookException;
    void remove(Book book) throws FailedToRemoveBookException;

    void findById(long id) throws FailedToFindBookException;
    void findByTitle(String title) throws FailedToFindBookException;
    void findByYear(int year) throws FailedToFindBookException;
    void findAll() throws FailedToFindBookException;
}
