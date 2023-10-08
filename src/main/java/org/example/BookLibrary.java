package org.example;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
public class BookLibrary {
    private ArrayList<Book> bookList;
    private SearchService searchService;

    public BookLibrary(ArrayList<Book> bookList) {
        this.bookList = bookList;
        this.searchService = new SearchService();
    }

    public BookLibrary() {
        this.bookList = new ArrayList<>();
        this.searchService = new SearchService();
    }

    public BookLibrary(int listSize) {
        this.searchService = new SearchService();
        this.bookList = new ArrayList<>();
        for (int i = 1; i <= listSize; i++) {
            bookList.add(new Book("Александр Пушкин" + i,
                    "Евгений Онегин",
                    1831, new BookGenre("Роман")));
        }
    }

    public ArrayList<Book> searchByAuthor(String authorName) {
        return searchService.searchByAuthor(authorName, bookList);
    }
}
