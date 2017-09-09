/**
 * 
 */
package com.gjapps.explore.data.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.gjapps.explore.data.entity.Book;
import com.gjapps.explore.data.entity.BookCategory;

/**
 * @author Syam
 *
 */
public interface BookCategoryRepo extends JpaRepository<BookCategory, Integer> {

	List<BookCategory> findByCategoryName(String categoryName);
}
