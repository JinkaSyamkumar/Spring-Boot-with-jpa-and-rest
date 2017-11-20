/**
 * 
 */
package com.gjapps.explore.data.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author Syam
 *
 */
@Entity
@Table(name="book")
public class Book{



	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq-gen")
	@SequenceGenerator(name="seq-gen",sequenceName="seq_book",allocationSize=1)
	@Column(name="book_id")
	private int id;
	
	@Column(name="book_name")	
	private String bookName;
	
	@ManyToOne(cascade= CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="book_category_id")
	@JsonBackReference
	private BookCategory bookCategory;

	/**
	 * 
	 */
	public Book() {
		super();
	}

	//BookCategory column is part of Book table so it is part constructor
	public Book(String bookName) {
		super();
		this.bookName = bookName;		
	}

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
//	@Override
//	public String toString() {
//		return "Book [id=" + id + ", bookName=" + bookName + ", bookCategory=" + bookCategory + "]";
//	}


	
	
}
