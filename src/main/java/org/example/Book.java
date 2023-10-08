package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Принцип единственной ответственности -> Single Responsibility Principle
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    private String authorName;
    private String description;
    private int releaseDate;
    private BookGenre bookGenre;
}
