package org.example;

import java.util.ArrayList;

public class JsonFormatter implements Formatter {

    @Override
    public String formatBookList(ArrayList<Book> formatBook) {
        return "Список был приведен к формату JSON : " + formatBook;
    }
}
