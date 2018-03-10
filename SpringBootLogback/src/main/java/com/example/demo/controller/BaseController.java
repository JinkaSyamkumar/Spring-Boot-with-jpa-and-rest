/**
 * 
 */
package com.example.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author syamkumarj
 *
 */
@RestController
public class BaseController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value="/log")
	public String log() {
		logger.trace("This is TRACE message");
		logger.debug("this is DEBUG message");
		logger.info("This is INFO message");
		logger.warn("This is WARN message");
		logger.error("This is ERROR message");
		return "done";
	}

}
