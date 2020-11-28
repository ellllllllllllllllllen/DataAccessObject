package edu.epam.zavadskaya.entity;

import java.math.BigDecimal;
import java.util.Set;

public class Book {
    private long bookId;
    private String title;
    private Author author;
    private PublishingHouse publishingHouse;
    private int year;
    private int numberOfPages;
    private BigDecimal price;
    private BindingType bindingtype;

    public Book(long bookId, String title, Author author, PublishingHouse publishingHouse, int year, int numberOfPages, BigDecimal price, BindingType bindingtype) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingtype = bindingtype;
    }

    public Book() {

    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public PublishingHouse getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(PublishingHouse publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BindingType getBindingtype() {
        return bindingtype;
    }

    public void setBindingtype(BindingType bindingtype) {
        this.bindingtype = bindingtype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (bookId != book.bookId) return false;
        if (year != book.year) return false;
        if (numberOfPages != book.numberOfPages) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        if (publishingHouse != null ? !publishingHouse.equals(book.publishingHouse) : book.publishingHouse != null)
            return false;
        if (price != null ? !price.equals(book.price) : book.price != null) return false;
        return bindingtype == book.bindingtype;
    }

    @Override
    public int hashCode() {
        int result = (int) (bookId ^ (bookId >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (publishingHouse != null ? publishingHouse.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + numberOfPages;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (bindingtype != null ? bindingtype.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book {");
        sb.append("book id = ").append(bookId);
        sb.append(", title = '").append(title).append('\'');
        sb.append(", author = ").append(author);
        sb.append(", publishing house = ").append(publishingHouse);
        sb.append(", year = ").append(year);
        sb.append(", number of pages = ").append(numberOfPages);
        sb.append(", price = ").append(price);
        sb.append(", binding type = ").append(bindingtype);
        sb.append('}');
        return sb.toString();
    }
}
