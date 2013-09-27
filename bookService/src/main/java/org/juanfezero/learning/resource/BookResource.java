package org.juanfezero.learning.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ttdev.bookservice.Book;

@Path("books/{isbn}")
public class BookResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Book getDetails(@PathParam("isbn") String isbn) {
		if (isbn.equals("1234")) {
			Book book = new Book();
			book.setIsbn("1234");
			book.setTitle("Java Programming");
			System.out.println("hola caracola");
			return book;

		}

		return null;
	}
}
