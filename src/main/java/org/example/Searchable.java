package org.example;

import java.util.ArrayList;

/**
 * Принцип разделения интерфейса ->
 * Interface Segregation Principle (достигается благодаря разделению на разные
 * interface, каждый делает что-то свое)
 */
public interface Searchable {
    ArrayList<Book> searchByAuthor(String authorName, ArrayList<Book> bookList);

}
