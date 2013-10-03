package org.juanfe.learning.persistence;

import java.util.HashMap;
import java.util.Map;

import org.juanfezero.learning.domain.Book;

public class BookDB {

	private Map<String, Book> books;

	public BookDB() {
		books = new HashMap<>();
		Book book1234 = new Book("1234", "Java Programming");
		addBook(book1234);
	}

	public Book getBook1234() {
		return books.get("1234");
	}

	public void addBook(Book book) {
		books.put(book.getIsbn(), book);
	}

	public static BookDB instance = new BookDB();
}
