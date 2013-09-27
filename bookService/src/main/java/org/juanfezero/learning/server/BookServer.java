package org.juanfezero.learning.server;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.juanfezero.learning.resource.BookResource;
import org.juanfezero.learning.resource.BookResourceCaching;

public class BookServer {
	public static void main(String[] args) throws InterruptedException {
		JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
		sf.setResourceClasses(BookResourceCaching.class);
		sf.setAddress("http://localhost:8080/bs");
		sf.create();
		System.out.println("Book Server Started.");
		Thread.sleep(10 * 60 * 1000);
		System.out.println("Server Stopped!!!!!!!");
		System.exit(0);

	}
}
