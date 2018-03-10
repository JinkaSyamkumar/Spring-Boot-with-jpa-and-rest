/**
 * 
 */
package com.learning.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.learning.demo.entity.MapOfBasicValues;

/**
 * @author syamkumarj
 *
 */
public interface MapOfBasicValuesRepo extends CrudRepository<MapOfBasicValues, Integer> {

}
