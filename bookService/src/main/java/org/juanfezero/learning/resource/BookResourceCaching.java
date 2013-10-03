package org.juanfezero.learning.resource;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.EntityTag;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import org.juanfe.learning.persistence.BookDB;
import org.juanfezero.learning.domain.Book;

import ttdev.bookservice.BookState;

@Path("books/{isbn}")
public class BookResourceCaching {

	@GET
	public Response getDetails(@Context Request request,
			@PathParam("isbn") String isbn) {

		BookDB bookDB = BookDB.instance;
		if (isbn.equals("1234")) {
			Book book = bookDB.getBook1234();

			ResponseBuilder responseBuilder = request
					.evaluatePreconditions(getVersion(book));
			if (responseBuilder != null) {
				setExpirit(responseBuilder);
			} else {
				BookState bookState = getBookState(book);
				responseBuilder = Response.ok(bookState);
				responseBuilder.lastModified(book.getLastModified());
				responseBuilder.type(MediaType.APPLICATION_XML);
				setExpirit(responseBuilder);

			}

			// Response response = Response.status(Status.OK)
			// .cacheControl(cacheControl).type(MediaType.APPLICATION_XML)
			// .entity(bookState).build();
			return responseBuilder.build();
		}

		return null;
	}

	private Date getVersion(Book book) {
		Date lastModified = book.getLastModified();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(lastModified);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	private void setExpirit(ResponseBuilder responseBuilder) {
		GregorianCalendar now = new GregorianCalendar();
		GregorianCalendar nextUpdate = getNextUpdateTime(now);
		int maxAge = (int) ((nextUpdate.getTimeInMillis() - now
				.getTimeInMillis()) / 1000L);

		CacheControl cacheControl = new CacheControl();
		cacheControl.setMaxAge(maxAge);
		responseBuilder.cacheControl(cacheControl);
		responseBuilder.expires(nextUpdate.getTime());

	}

	private static BookState getBookState(Book book) {
		BookState bookState = new BookState();
		bookState.setIsbn(book.getIsbn());
		bookState.setTitle(book.getTitle());
		return bookState;
	}

	private GregorianCalendar getNextUpdateTime(GregorianCalendar now) {
		GregorianCalendar nextUpdate = new GregorianCalendar();
		nextUpdate.setTime(now.getTime());
		nextUpdate.set(Calendar.HOUR_OF_DAY, 10);
		nextUpdate.set(Calendar.MINUTE, 0);
		nextUpdate.set(Calendar.SECOND, 0);
		nextUpdate.set(Calendar.MILLISECOND, 0);
		if (now.get(Calendar.HOUR_OF_DAY) >= 10) {
			nextUpdate.add(Calendar.DAY_OF_YEAR, 1);
		}
		return nextUpdate;
	}

}
