package com.gjapps.explore.vo;

import com.gjapps.explore.data.entity.BookCategory;

public class BookVO {

	private int id;
	private String bookName;
	private BookCategory bookCategory;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the bookCategory
	 */
	public BookCategory getBookCategory() {
		return bookCategory;
	}
	/**
	 * @param bookCategory the bookCategory to set
	 */
	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}
	
	
}
