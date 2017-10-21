/**
 * 
 */
package com.learning.demo.repo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author syamkumarj
 *
 */
//@Repository
public class ExtendedRepositoryImpl<T, ID extends Serializable> 
		extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID>{

	@Autowired
	private JpaEntityInformation<T,?> entityInformation;
	@Autowired
	private EntityManager entityManager;
	
	public ExtendedRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);	
		this.entityInformation=entityInformation;
		this.entityManager=entityManager;
	}


	@Override
	@Transactional
	public List<T> findByIds(ID... ids) {
		Query query = this.entityManager.createQuery("select e from " + this.entityInformation.getEntityName() 
		+ " e where e." + this.entityInformation.getIdAttribute().getName() + " in :ids");
	query.setParameter("ids", Arrays.asList(ids));
	return (List<T>) query.getResultList();
	}

}
