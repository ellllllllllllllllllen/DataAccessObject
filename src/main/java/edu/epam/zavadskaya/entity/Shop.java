package edu.epam.zavadskaya.entity;

import java.util.ArrayList;
import java.util.List;

public class Shop implements BaseDao{
    private static final Shop INSTANCE = new Shop();
    private ArrayList<Book> books = new ArrayList<>();

    private Shop(){ }

    public Shop(ArrayList<Book> books) {
        this.books = books;
    }

    public static Shop getInstance() {
        return INSTANCE;
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public int size(){
        return books.size();
    }


    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        return null;
    }

    @Override
    public List<Book> findById(long id) {

        return null;
    }

    @Override
    public boolean delete(Book book) {
        books.remove(book);
        return false;
    }

    @Override
    public boolean delete(long id) {
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getBookId() == id){
                books.remove(books.get(i));
            }
        }
        return true;
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
