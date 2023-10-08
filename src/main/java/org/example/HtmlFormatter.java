package org.example;

import java.util.ArrayList;

public class HtmlFormatter implements Formatter {

    @Override
    public String formatBookList(ArrayList<Book> formatBook) {
        return "Список был приведен к формату HTML : " + formatBook;
    }
}
