package org.juanfezero.learning.resource;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.juanfe.learning.persistence.BookDB;
import org.juanfezero.learning.domain.Book;

import ttdev.bookservice.BookState;

@Path("books")
public class BooksResource {
	@POST
	public Response add(@Context Request request, BookState bookState) {
		BookDB.instance.addBook(new Book(bookState.getIsbn(), bookState
				.getTitle()));
		try {
			ResponseBuilder builder = Response.created(new URI(
					"http://localhost:8080/bs/books/" + bookState.getIsbn()));
			return builder.build();
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
	}
}
