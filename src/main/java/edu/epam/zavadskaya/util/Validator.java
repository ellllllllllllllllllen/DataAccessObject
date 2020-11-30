package edu.epam.zavadskaya.util;

import edu.epam.zavadskaya.entity.Book;
import edu.epam.zavadskaya.entity.Shop;

import java.util.Calendar;

public class Validator<T> {

    public boolean isExist(Shop shop, Book book){
        return shop.getBooks().contains(book);
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
    public boolean isCorrectForSearch(T criterion, Shop shop) {
        boolean result = false;
//        for (int i = 0; i < shop.getBooks().size(); i++) {
//            result = (criterion.equals(shop.getBooks(i).getBookId())
//                    || criterion.equals(shop.getBooks(i).getTitle())
//                    || criterion.equals(shop.getBooks(i).getAuthor().getName())
//                    || criterion.equals(shop.getBooks(i).getAuthor().getLastName())
//                    || criterion.equals(shop.getBooks(i).getPublishingHouse().getName())
//                    || criterion.equals(shop.getBooks(i).getPublishingHouse().getCountry())
//                    || criterion.equals(shop.getBooks(i).getYear() > 0)
//                    || criterion.equals(shop.getBooks(i).getYear() <= Calendar.getInstance().get(Calendar.YEAR))
//                    || shop.getBooks(i).getNumberOfPages() > 0
//                    || shop.getBooks(i).getPrice().signum() != -1);
//        }
        return result;
    }
}
