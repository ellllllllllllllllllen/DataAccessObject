package edu.epam.zavadskaya.entity;

import java.util.ArrayList;
import java.util.List;

public class Shop<T> implements IShop<T, Book> {
    private static final Shop INSTANCE = new Shop();

    private ArrayList<Book> books = new ArrayList<>();

    private Shop() {
    }

    public Shop(ArrayList<Book> books) {
        this.books = books;
    }

    public static Shop getInstance() {
        return INSTANCE;
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
    public List<Book> search(T criterion, Shop shop) {
        List<Book> searchedBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getCriterion(criterion) == criterion){
                searchedBooks.add(books.get(i));
            }
//            if (criterion.equals(books.get(i).getCriterion(criterion))) {
//                searchedBooks.add(books.get(i));
//            }
        }
        System.out.println(searchedBooks);
        return searchedBooks;
    }
}



