/**
 * 
 */
package com.gjapps.explore.vo;

import java.util.Set;

import com.gjapps.explore.data.entity.Book;

/**
 * @author Syam
 *
 */
public class BookCategoryVO {
	
	private int id;
	private String categoryName;
	private Set<Book> books;
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
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}
	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	/**
	 * @return the books
	 */
	public Set<Book> getBooks() {
		return books;
	}
	/**
	 * @param books the books to set
	 */
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
	
}
