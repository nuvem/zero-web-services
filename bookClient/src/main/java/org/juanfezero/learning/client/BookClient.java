package org.juanfezero.learning.client;

import org.apache.cxf.jaxrs.client.WebClient;

import ttdev.bookservice.Book;


public class BookClient {

	public static void main(String[] args) {
		WebClient client = WebClient.create("http://localhost:8080/bs");
		client.path("books/1234");
		Book book = client.get(Book.class);
		System.out.println(book.getTitle());
	}
	
}
