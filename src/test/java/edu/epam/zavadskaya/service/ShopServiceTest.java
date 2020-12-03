package edu.epam.zavadskaya.service;

import edu.epam.zavadskaya.dao.Shop;
import edu.epam.zavadskaya.entity.*;
import edu.epam.zavadskaya.exception.FailedToAddBookException;
import edu.epam.zavadskaya.exception.FailedToFindBookException;
import edu.epam.zavadskaya.exception.FailedToRemoveBookException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopServiceTest {

    List<Book> books = new ArrayList<>();
    ShopService shopService = new ShopService();

    @BeforeMethod
    public void testAddBooks() {
        books = Shop.getInstance().getBooks();

        books.add(new Book(1, "We", new Author("Evgeniy", "Zamyatin"),
                new PublishingHouse("Drofa", Country.RUSSIA), 1998, 254, new BigDecimal(15.60), BindingType.SOFT));

        books.add(new Book(2, "Cutting Edge", new Author("William", "Damian"),
                new PublishingHouse("Pearson Education", Country.UK), 2017, 314, new BigDecimal(35.99), BindingType.HARD));

        books.add(new Book(3, "Walden & Civil Disobedience", new Author("Henry", "David"),
                new PublishingHouse("Wordsworth", Country.FRANCE), 2016, 140, new BigDecimal(22.50), BindingType.HARD));
    }

    @Test
    public void testAdd() throws FailedToAddBookException {
        shopService.add(new Book(4, "Livre de l'eleve", new Author("Henry", "David"),
                new PublishingHouse("Pearson Education", Country.FRANCE), 1999, 120, new BigDecimal(16.99), BindingType.SOFT));
    }

    @Test
    public void testFailAdd() throws FailedToAddBookException {
        shopService.add(new Book(1, "We", new Author("Evgeniy", "Zamyatin"),
                new PublishingHouse("Drofa", Country.RUSSIA), 1998, 254, new BigDecimal(15.60), BindingType.SOFT));
    }

    @Test
    public void testRemove() throws FailedToRemoveBookException {
        shopService.remove(new Book(4, "Livre de l'eleve", new Author("Henry", "David"),
                new PublishingHouse("Pearson Education", Country.FRANCE), 1999, 120, new BigDecimal(16.99), BindingType.SOFT));
    }

    @Test
    public void testFailRemove() throws FailedToRemoveBookException {
        shopService.remove(new Book(5, "Level A", new Author("Puchta", "Herbert"),
                new PublishingHouse("Pearson Education", Country.UK), 2016, 210, new BigDecimal(30.99), BindingType.SOFT));
    }

    @Test
    public void testFindById() throws FailedToFindBookException {
        shopService.findById(1);
    }

    @Test
    public void testFailFindById() throws FailedToFindBookException {
        shopService.findById(6);
    }

    @Test
    public void testFindByTitle() throws FailedToFindBookException {
        shopService.findByTitle("Cutting Edge");
    }

    @Test
    public void testFailFindByTitle() throws FailedToFindBookException {
        shopService.findByTitle("Hello");
    }

    @Test
    public void testFindByYear() throws FailedToFindBookException {
        shopService.findByYear(2017);
    }

    @Test
    public void testFailFindByYear() throws FailedToFindBookException {
        shopService.findByYear(1000);
    }

    @Test
    public void testFindAll() throws FailedToFindBookException {
        shopService.findAll();
    }
}

