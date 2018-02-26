/**
 * 
 */
package com.learning.apitest.web;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.apitest.dao.RefRepo;
import com.learning.apitest.entity.ProductItem;
import com.learning.apitest.service.RefService;
import com.learning.apitest.vo.ProductItemVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

/**
 * @author syamkumarj
 *
 */
@RestController
@RequestMapping(value="/refapi")
@Api(tags=("efeatureapi"))
public class RefController {

	@Autowired
	private RefService refService;
	
	@GetMapping(value="/getupcs")
//	public List<ProductItemVO> getUPCs(){
	@ApiOperation(value="Get All UPCs", notes="View a list of UPCs", nickname="Get All UPCs1", authorizations = {@Authorization(value="basicAuth")})
		public List<ProductItemVO> getUPCs(@RequestParam(value="param1", required=false)String param1,
				@RequestParam(value="param2", required=false)String param2,
				@RequestParam(value="param3", required=false)String param3){
		
		ProductItem obProductItem= verifyValues(param1,param2,param3);
		
		System.out.println(obProductItem);
		return refService.getUPCs().stream().map(t -> toVO(t)).collect(Collectors.toList()); 
		
	}
	   

	private ProductItem verifyValues(String param1, String param2, String param3) {
		
		verifyParam1(param1);
		
		return null;
	}
	
	private void verifyParam1(String param1) {
		
		
	}



	private ProductItemVO toVO(ProductItem productItem) {
		return new ProductItemVO(productItem.getId(), productItem.getUpc(), productItem.getBrand(), productItem.getBrandDescription(), productItem.getSize());
	}
}
