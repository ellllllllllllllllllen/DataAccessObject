package edu.epam.zavadskaya.service;

import edu.epam.zavadskaya.entity.Book;
import edu.epam.zavadskaya.dao.Shop;
import edu.epam.zavadskaya.exception.FailedToAddBookException;
import edu.epam.zavadskaya.exception.FailedToFindBookException;
import edu.epam.zavadskaya.exception.FailedToRemoveBookException;
import edu.epam.zavadskaya.util.Validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ShopService implements IShopService{

    private static final Logger logger = LogManager.getLogger(ShopService.class);

    Validator validator = new Validator();

    @Override
    public void add(Book book) throws FailedToAddBookException {
        if(!validator.isExist(book)){
            if (validator.isDataCorrect(book)) {
                Shop.getInstance().addBook(book);
            } else {
                logger.error("Error to add book - Incorrect data.");
                throw new FailedToAddBookException();
            }
        } else {
            logger.error("Error to add book - The book {} is already exists.", book);
            throw new FailedToAddBookException();
        }
    }

    @Override
    public void remove(Book book) throws FailedToRemoveBookException {
        if(validator.isExist(book)){
            Shop.getInstance().deleteBook(book);
        } else {
            logger.error("Error to remove book - The book {} doesn't exist.", book);
            throw new FailedToRemoveBookException();
        }
    }

    @Override
    public void findById(long id) throws FailedToFindBookException {
        boolean isFound = false;
        Book foundedBook = null;
        for (Book book : Shop.getInstance().getBooks()) {
            if(book.getBookId() == id) {
                isFound = true;
                foundedBook = book;
            }
        }
        if(isFound) {
            Shop.getInstance().findById(foundedBook);
        } else{
            logger.error("Error to find book - The book with id {} doesn't exist.", id);
            throw new FailedToFindBookException();
        }
    }

    @Override
    public void findByTitle(String title) throws FailedToFindBookException {
        List<Book> searchedBooks = new ArrayList<>();
        boolean isFound = false;
        for (Book book : Shop.getInstance().getBooks()) {
            if(book.getTitle() == title){
                searchedBooks.add(book);
                isFound = true;
            }
        }
        if(isFound) {
            Shop.getInstance().findByTitle(searchedBooks);
        } else{
            logger.error("Error to find book - The book with the title {} doesn't exist.", title);
            throw new FailedToFindBookException();
        }
    }

    @Override
    public void findByYear(int year) throws FailedToFindBookException {
        List<Book> searchedBooks = new ArrayList<>();
        boolean isFound = false;
        for (Book book : Shop.getInstance().getBooks()) {
            if(book.getYear() == year){
                searchedBooks.add(book);
                isFound = true;
            }
        }
        if(isFound) {
            Shop.getInstance().findByTitle(searchedBooks);
        } else{
            logger.error("Error to find book - The book with the year {} doesn't exist.", year);
            throw new FailedToFindBookException();
        }
    }

    @Override
    public void findAll() throws FailedToFindBookException {
        if(!Shop.getInstance().getBooks().isEmpty()){
            Shop.getInstance().findAll(Shop.getInstance().getBooks());
        }else{
            logger.error("Error to find books - The list is empty");
            throw new FailedToFindBookException();
        }
    }
}
