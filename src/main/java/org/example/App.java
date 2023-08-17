package org.example;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Book> books = new ArrayList<>();


        // Adding new books
        books.add(new Book("book1",23,"yazar1","2000"));
        books.add(new Book("book2",23,"yazar2","2010"));
        books.add(new Book("book3",2323,"yazar3","2004"));
        books.add(new Book("book4",223,"yazar4","2006"));
        books.add(new Book("book5",253,"yazar5","2002"));
        books.add(new Book("book6",263,"yazar6","2003"));
        books.add(new Book("book7",623,"yazar7","2000"));
        books.add(new Book("book8",323,"yazar8","2002"));
        books.add(new Book("book9",123,"yazar9","2005"));
        books.add(new Book("book10",243,"yazar10","2010"));


        // created new map for book and author duos
        Map<String, String > bookAuthorMap = books.stream()
                .collect(Collectors.toMap(Book::getName,Book::getAuthorName));
        System.out.println("book author map method  ");
        System.out.println();

        // booksAuthorMap written to console
        bookAuthorMap.forEach((key,value) -> {
            System.out.println("Book name : " + key + "\t Book author: " + value);
        });
        System.out.println();

        // created new list to select books with more than 100 pages
        List<Book> booksFilter = books.stream()
                .filter(book -> book.getPage() > 100)
                .collect(Collectors.toList());

        //booksFilter written to console
        System.out.println("Books filter 'page number over than 100 ' ");
        System.out.println();
        booksFilter.forEach(book -> {
            System.out.println( "Book name : " + book.getName() +
                                "\tPage number : " + book.getPage() +
                                "\tAuthor : " + book.getAuthorName() +
                                "\tRelease Date : " + book.getReleaseDate());
        });
    }
}
