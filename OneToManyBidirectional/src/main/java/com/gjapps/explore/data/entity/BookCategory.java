/**
 * 
 */
package com.gjapps.explore.data.entity;


import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;



/**
 * @author Syam
 *
 */
@Entity
@Table(name="book_category")
public class BookCategory{
	

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="category_id")
	private int id;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(mappedBy="bookCategory",cascade=CascadeType.ALL,fetch = FetchType.EAGER)	
	@JsonBackReference
	private Set<Book> books;

	/**
	 * 
	 */
	public BookCategory() {
		super();
	} 

	/**
	 * @param categoryName
	 */
//	public BookCategory(int id,String categoryName) {
//		this.id=id;
//		this.categoryName = categoryName;
//	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 * @param categoryName
	 * @param lstBooks
	 */
	public BookCategory(int id, String categoryName) {
		super();
		this.id = id;
		this.categoryName = categoryName;
	
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




/*	*//**
	 * @return the lstBooks
	 *//*
	public List<Book> getLstBooks() {
		return lstBooks;
	}

	*//**
	 * @param lstBooks the lstBooks to set
	 *//*
	public void setLstBooks(List<Book> lstBooks) {
		this.lstBooks = lstBooks;
	}*/

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	
	
	
	

}
