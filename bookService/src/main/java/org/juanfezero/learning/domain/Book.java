package org.juanfezero.learning.domain;

import java.util.Date;

public class Book {

	private String isbn;
	private String title;
	private Date lastModified;

	public Book() {

	}

	public Book(String isbn, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.lastModified = new Date();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

}
