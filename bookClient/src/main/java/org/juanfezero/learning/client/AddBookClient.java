package org.juanfezero.learning.client;

import org.apache.cxf.jaxrs.client.WebClient;

import ttdev.bookservice.BookState;

public class AddBookClient {

	public static void main(String[] args) {
		WebClient client = WebClient.create("http://localhost:8080/bs");
		BookState bookState = new BookState();
		bookState.setIsbn("5678");
		bookState.setTitle("Design Patterns");
		client.path("books");
		client.back(true);
		client.path("books/5678");
		BookState bookState2 = client.get(BookState.class);
		System.out.println(bookState2.getTitle());
	}

}
