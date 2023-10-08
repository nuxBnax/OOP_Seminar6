package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary(5);
        System.out.println("bookLibrary = " + bookLibrary);

        System.out.println("------------------------------------");

        System.out.println("bookLibrary.searchByAuthor(\"Александр Пушкин3\") = "
                + bookLibrary.searchByAuthor("Александр Пушкин3"));

        ArrayList<Book> findBook = bookLibrary.searchByAuthor("Александр Пушкин3");
        Formatter formatter = new JsonFormatter();
        System.out.println("------------------------------------");
        System.out.println("formatter.formatBookList(findBook) = " + formatter.formatBookList(findBook));

        System.out.println("------------------------------------");
        formatter = new HtmlFormatter();
        System.out.println("formatter.formatBookList(findBook) = " + formatter.formatBookList(findBook));

    }
}