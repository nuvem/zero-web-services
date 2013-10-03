package org.juanfezero.learning.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.juanfe.learning.persistence.BookDB;
import org.juanfezero.learning.resource.BookResourceCaching;
import org.juanfezero.learning.resource.BooksResource;

public class BookServer {
	public static void main(String[] args) throws InterruptedException,
			IOException {
		JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
		// sf.setResourceClasses(BookResourceCaching.class);
		sf.setResourceClasses(BooksResource.class);
		sf.setAddress("http://localhost:8080/bs");
		sf.create();
		System.out.println("Book Server Started.");
		Thread.sleep(10 * 60 * 1000);

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// for (;;) {
		// System.out.println("Enter command: u--update. q--quit");
		// String cmd = br.readLine();
		// if (cmd.equals("u")) {
		// BookDB.instance.getBook1234().setLastModified(new Date());
		// } else if (cmd.equals("q")) {

		System.out.println("Server Stopped!!!!!!!");
		System.exit(0);
		//
		// }
		// }

	}
}
