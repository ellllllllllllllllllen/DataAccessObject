package edu.epam.zavadskaya.service;

import edu.epam.zavadskaya.dao.Shop;
import edu.epam.zavadskaya.entity.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopServiceTest {

    List<Book> books = new ArrayList<>();
    ShopService shopService;
    Author author;
    PublishingHouse publishingHouse;
    BigDecimal price;

    @BeforeMethod
    public void create() {
        books = Shop.getInstance().getBooks();
        shopService = new ShopService();

        books.add(new Book(1, "We", new Author("Evgeniy", "Zamyatin"),
                new PublishingHouse("Drofa", Country.RUSSIA), 1998, 254, new BigDecimal(15.60), BindingType.SOFT));

        books.add(new Book(2, "Cutting Edge", new Author("William", "Damian"),
                new PublishingHouse("Pearson Education", Country.UK), 2017, 314, new BigDecimal(35.99), BindingType.HARD));

        books.add(new Book(3, "Walden & Civil Disobedience", new Author("Henry", "David"),
                new PublishingHouse("Wordsworth", Country.FRANCE), 2016, 140, new BigDecimal(22.50), BindingType.HARD));

        books.add(new Book(4, "Livre de l'eleve", new Author("Henry", "David"),
                new PublishingHouse("Pearson Education", Country.FRANCE), 1999, 120, new BigDecimal(16.99), BindingType.SOFT));

    }
    @Test
    public void testAdd() {

    }

    @Test
    public void testRemove() {
    }

    @Test
    public void testFindById() {
    }

    @Test
    public void testFindByTitle() {
    }

    @Test
    public void testFindByYear() {
    }

    @Test
    public void testFindAll() {
    }
}

    List<Car> cars;
    CarDaoImpl carDao;

    @BeforeMethod
    public void create() {
        cars = CarStorage.getInstance().getCars();
        carDao = new CarDaoImpl();

        cars.add(new Car(1, "R8", Brand.AUDI, 2018, Color.BLACK, new BigDecimal(30000), "1278-Th-4"));
        cars.add(new Car(2, "K0", Brand.PORSCHE, 2008, Color.WHITE, new BigDecimal(43647), "5678-Hh-6"));
        cars.add(new Car(3, "L2", Brand.BMW, 2012, Color.RED, new BigDecimal(645643), "1278-Ey-0"));
        cars.add(new Car(4, "P4", Brand.CITROEN, 2004, Color.GREEN, new BigDecimal(3464), "5027-PL-7"));
        cars.add(new Car(5, "Mr", Brand.MERCEDES, 2010, Color.BLUE, new BigDecimal(234523), "5600-Op-5"));
    }
