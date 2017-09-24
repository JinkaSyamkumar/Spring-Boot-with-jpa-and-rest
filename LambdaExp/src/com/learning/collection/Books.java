/**
 * 
 */
package com.learning.collection;

/**
 * @author syamkumarj
 *
 */
public class Books {
	
	private String title;
	private String authorFName;
	private String authorLname;
	private int pages;
	
	/**
	 * @param title
	 * @param authorFName
	 * @param authorLname
	 * @param pages
	 */
	public Books(String title, String authorFName, String authorLname, int pages) {
		super();
		this.title = title;
		this.authorFName = authorFName;
		this.authorLname = authorLname;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorFName() {
		return authorFName;
	}

	public void setAuthorFName(String authorFName) {
		this.authorFName = authorFName;
	}

	public String getAuthorLname() {
		return authorLname;
	}

	public void setAuthorLname(String authorLname) {
		this.authorLname = authorLname;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Books [title=" + title + ", authorFName=" + authorFName + ", authorLname=" + authorLname + ", pages="
				+ pages + "]";
	}
	
	
	
	

}
