/**
 * 
 */
package com.learning.demo.repo;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learning.demo.entity.SingleTable;

/**
 * @author syamkumarj
 *
 */
@Repository
public class SingleTableRepoImpl implements SingleTableRepoCustom {

	private static Logger logger = LoggerFactory.getLogger(SingleTableRepoImpl.class);
//	
	@Autowired
	private EntityManager entityManager;
//	@PersistenceContext
//    EntityManager entityManager;
	
	@Override
	@Transactional
	public void createDetails(SingleTable singleTable) {
		//entityManager.getTransaction().begin();
		logger.warn("in custom class");
		logger.warn("isingle table"+singleTable.getId());
		entityManager.persist(singleTable);
	//	entityManager.getTransaction().commit();
	//	entityManager.close();

	}

}
