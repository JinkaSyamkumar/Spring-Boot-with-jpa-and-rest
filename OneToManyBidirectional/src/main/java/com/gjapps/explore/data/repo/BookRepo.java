/**
 * 
 */
package com.gjapps.explore.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.gjapps.explore.data.entity.Book;

/**
 * @author Syam
 *
 */
public interface BookRepo extends JpaRepository<Book, Integer> {
	
	List<Book> findByBookName(String bookName);

}
