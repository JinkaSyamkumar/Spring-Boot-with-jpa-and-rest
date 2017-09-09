package com.gjapps.explore.web.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gjapps.explore.data.entity.Book;
import com.gjapps.explore.data.entity.BookCategory;
import com.gjapps.explore.data.repo.BookCategoryRepo;
import com.gjapps.explore.data.repo.BookRepo;
import com.gjapps.explore.vo.BookCategoryVO;
import com.gjapps.explore.vo.BookVO;

@RestController
public class MainController {

	@Autowired
	private BookCategoryRepo bookCategoryRepo;

	@Autowired
	private BookRepo bookRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@GetMapping(value = "/save")
	public String Save() {

		/*
		 * BookCategory obBookCategory = new BookCategory(1,"Comedy"); BookCategory
		 * obBookCategory1 = new BookCategory(2,"Thriller");
		 * 
		 * Book obBook=new Book("KICK",obBookCategory); Book obBook2=new
		 * Book("DHEE",obBookCategory);
		 * 
		 * List<Book> lsBook = new ArrayList<Book>(); lsBook.add(obBook);
		 * lsBook.add(obBook2);
		 * 
		 * obBookCategory.setLstBooks(lsBook); bookCategoryRepo.save(obBookCategory);
		 */

		BookCategory obBookCategory = new BookCategory();
		obBookCategory.setId(1);
		obBookCategory.setCategoryName("Comedy");
		
		BookCategory obBookCategory1 = new BookCategory();
		obBookCategory1.setId(2);
		obBookCategory1.setCategoryName("Mass");

		Book obBook = new Book();
		obBook.setBookName("READY");
		obBook.setBookCategory(obBookCategory);
		Book obBook2 = new Book();
		obBook2.setBookName("MBBS");
		obBook2.setBookCategory(obBookCategory);

		Set<Book> setBooks = new HashSet<>();
		setBooks.add(obBook);
		setBooks.add(obBook2);
		obBook2.setBookCategory(obBookCategory);

		obBookCategory.setBooks(setBooks);
		bookCategoryRepo.save(obBookCategory);
		
		Book obBook3 = new Book();
		obBook3.setBookName("Nayak");
		obBook3.setBookCategory(obBookCategory1);
		Book obBook4 = new Book();
		obBook4.setBookName("Indra");
		obBook4.setBookCategory(obBookCategory1);

		Set<Book> setBooks1 = new HashSet<>();
		setBooks1.add(obBook3);
		setBooks1.add(obBook4);
		obBook2.setBookCategory(obBookCategory1);
		obBookCategory1.setBooks(setBooks1);
		bookCategoryRepo.save(obBookCategory1);

		return "done";
	}

	@GetMapping(value = "/findCategories")
	public List<BookCategoryVO> findCategories() {

//		List<BookCategory> lstBCs = new ArrayList<>();
//		Iterable<BookCategory> iterableEmps = bookCategoryRepo.findAll();
//		iterableEmps.forEach(lstBCs::add);
//		return lstBCs;

		List<BookCategory> lstBcs = bookCategoryRepo.findAll();
		return lstBcs.stream().map(bookCategory -> convertToVO(bookCategory)).collect(Collectors.toList());
	}

	@GetMapping(value = "/findBooks")
	public List<BookVO> findBooks() {

//		List<Book> lstBs = new ArrayList<>();
//		Iterable <Book> lstBs = bookRepo.findAll();
//		iterableEmps.forEach(lstBs::add);
//		return lstBs;
		
		List<Book> lstBs = bookRepo.findAll();
		return lstBs.stream()
		          .map(book -> convertToVO(book))
		          .collect(Collectors.toList());

	}

	@GetMapping(value = "/findByBookName")
	public List<BookVO> findByBookName() {
		List<Book> lstBs = bookRepo.findByBookName("Nayak");
		return lstBs.stream()
		          .map(book -> convertToVO(book))
		          .collect(Collectors.toList());
	}

	@GetMapping(value = "/findByBookCategory")
	public List<BookCategoryVO> findByBookCategory() {
		List<BookCategory> lstBCs = bookCategoryRepo.findByCategoryName("Comedy");
		return lstBCs.stream().map(bookCategory -> convertToVO(bookCategory)).collect(Collectors.toList());
	}
	
	
	private BookCategoryVO convertToVO(BookCategory bookCategory) {
		BookCategoryVO bookCategoryVO=modelMapper.map(bookCategory, BookCategoryVO.class);
		return bookCategoryVO;
		
	}

	private BookVO convertToVO(Book book) {
		BookVO bookVO=modelMapper.map(book, BookVO.class);
		return bookVO;
	}
}
