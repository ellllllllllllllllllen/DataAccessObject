package edu.epam.zavadskaya.util;

import edu.epam.zavadskaya.entity.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    private static final Logger logger = LogManager.getLogger(DataReader.class);

    public List readFromFile(String path){
        List<Book> books = new ArrayList();

        try(Scanner scanner = new Scanner(new File(path))){
            while (scanner.hasNext()){
                Book book = new Book();
                book.setBookId(Long.valueOf(scanner.next()));
                book.setTitle(scanner.next());
                book.setAuthor(new Author(scanner.next(), scanner.next()));
                book.setPublishingHouse(new PublishingHouse(scanner.next(), Country.valueOf(scanner.next())));
                book.setYear(scanner.nextInt());
                book.setNumberOfPages(scanner.nextInt());
                book.setPrice(BigDecimal.valueOf(scanner.nextDouble()));
                book.setBindingtype(BindingType.valueOf(scanner.next()));

                books.add(book);
            }
        } catch (FileNotFoundException e) {
            logger.error(e.getMessage());
        }
        return books;
    }
}
