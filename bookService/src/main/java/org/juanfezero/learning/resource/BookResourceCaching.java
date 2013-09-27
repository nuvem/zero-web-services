package org.juanfezero.learning.resource;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import ttdev.bookservice.Book;

@Path("books/{isbn}")
public class BookResourceCaching {

	@GET
	// @Produces(MediaType.APPLICATION_XML)
	public Response getDetails(@PathParam("isbn") String isbn) {
		if (isbn.equals("1234")) {
			Book book = new Book();
			book.setIsbn("1234");
			book.setTitle("Java Programming");

			GregorianCalendar now = new GregorianCalendar();
			GregorianCalendar nextUpdate = getNextUpdateTime(now);
			int maxAge = (int) ((nextUpdate.getTimeInMillis() - now
					.getTimeInMillis()) / 1000L);
		
			CacheControl cacheControl = new CacheControl();
			cacheControl.setMaxAge(maxAge);
			Response response = Response.status(Status.OK)
					.cacheControl(cacheControl).type(MediaType.APPLICATION_XML)
					.entity(book).build();
			return response;
		}

		return null;
	}

	// @GET
	public Response getDetailsDOESNTWORK(@PathParam("isbn") String isbn) {
		if (isbn.equals("1234")) {
			Book book = new Book();
			book.setIsbn("1234");
			book.setTitle("Java Programming");
			ResponseBuilder builder = Response.ok(book);
			GregorianCalendar now = new GregorianCalendar();
			GregorianCalendar nextUpdate = getNextUpdateTime(now);
			int maxAge = (int) ((nextUpdate.getTimeInMillis() - now
					.getTimeInMillis()) / 1000L);
			CacheControl cacheControl = new CacheControl();
			cacheControl.setMaxAge(maxAge);
			builder.cacheControl(cacheControl);
			builder.expires(nextUpdate.getTime());
			return builder.build();
		}
		return null;
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
