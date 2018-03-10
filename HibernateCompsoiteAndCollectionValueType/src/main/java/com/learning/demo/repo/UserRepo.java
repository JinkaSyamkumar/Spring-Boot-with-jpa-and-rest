/**
 * 
 */
package com.learning.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.learning.demo.entity.CompositeTypeUserEntity;

/**
 * @author syamkumarj
 *
 */
public interface UserRepo extends CrudRepository<CompositeTypeUserEntity, Integer > {

}
