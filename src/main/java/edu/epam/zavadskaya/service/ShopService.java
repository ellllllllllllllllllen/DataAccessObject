package edu.epam.zavadskaya.service;

import edu.epam.zavadskaya.entity.Book;
import edu.epam.zavadskaya.entity.Shop;
import edu.epam.zavadskaya.exception.FailedToAddBookException;
import edu.epam.zavadskaya.exception.FailedToRemoveBookException;
import edu.epam.zavadskaya.util.Validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ShopService<T> {
    private static final Logger logger = LogManager.getLogger(ShopService.class);

    Validator validator = new Validator();

    public void add(Shop shop, Book book) throws FailedToAddBookException {
        if(!validator.isExist(shop, book)){
            if (validator.isDataCorrect(book)) {
                shop.addBook(book);
            } else {
                logger.error("Error to add book - incorrect data.");
                throw new FailedToAddBookException("Incorrect data.");
            }
        } else {
            logger.error("Error to add book - book is already exists.");
            throw new FailedToAddBookException("The book is already exists.");
        }

    }

    public void remove(Shop shop, Book book) throws FailedToRemoveBookException {
        if(validator.isExist(shop, book)){
            shop.deleteBook(book);
        }
        else {
            logger.error("Error to remove book - book isn't exists.");
            throw new FailedToRemoveBookException("The book isn't exists.");
        }
    }

    public void search(T criterion, Shop shop) {
        if(validator.isCorrectForSearch(criterion, book)){

        }
        shop.search(criterion, shop);

    }
}
