/**
 * 
 */
package com.gjapps.explore.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjapps.explore.data.entity.EmpAddress;

/**
 * @author Syam
 *
 */
public interface EmpAddressRep extends JpaRepository<EmpAddress, Integer> {

}
