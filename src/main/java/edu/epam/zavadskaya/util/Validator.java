package edu.epam.zavadskaya.util;

import edu.epam.zavadskaya.entity.Book;
import edu.epam.zavadskaya.dao.Shop;

import java.util.Calendar;

public class Validator<T> {

    public boolean isExist(Book book){
        boolean isExists = true;
        for (Book availableBook : Shop.getInstance().getBooks()) {
            if(availableBook.getBookId() != book.getBookId()){
                isExists = false;
            }
        }
        return isExists;
    }

    public boolean isDataCorrect(Book book) {
        return (book.getBookId() != 0
                && book.getTitle() != null
                && book.getAuthor().getName() != null
                && book.getAuthor().getLastName() != null
                && book.getPublishingHouse().getName() != null
                && book.getPublishingHouse().getCountry() != null
                && book.getYear() > 0
                && book.getYear() <= Calendar.getInstance().get(Calendar.YEAR)
                && book.getNumberOfPages() > 0
                && book.getPrice().signum() != -1);
    }


}
