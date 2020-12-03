package edu.epam.zavadskaya.util;

import edu.epam.zavadskaya.entity.Author;
import edu.epam.zavadskaya.entity.Book;
import edu.epam.zavadskaya.entity.PublishingHouse;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    Book book = new Book();
    Author author = new Author();

//    public List readFromFile(String path){
//        List<Book> books = new ArrayList();
//
//        try(Scanner scanner = new Scanner(new File(path))){
//            while (scanner.hasNext()){
//                book.setBookId(Long.valueOf(scanner.next()));
//                book.setTitle(scanner.next());
//                book.setAuthor(author.setName(scanner.next()), author.setLastName(scanner.next()));
//                book.setAuthor(author.setLastName(scanner.next()));
//                book.setPublishingHouse(PublishingHouse);
//
//            }
//        }
//        return books;
//    }
}
