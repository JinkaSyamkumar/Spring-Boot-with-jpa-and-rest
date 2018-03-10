/**
 * 
 */
package com.learning.apitest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.apitest.dao.RefRepo;
import com.learning.apitest.entity.ProductItem;

/**
 * @author syamkumarj
 *
 */
@Service
public class RefServiceImpl implements RefService{

	@Autowired
	private RefRepo refRepo;
	
	@Override
	public List<ProductItem> getUPCs() {	
		return refRepo.findAll(); 
	}

}
