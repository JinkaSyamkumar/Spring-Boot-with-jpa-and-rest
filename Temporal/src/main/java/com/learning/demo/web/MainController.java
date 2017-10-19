/**
 * 
 */
package com.learning.demo.web;

import java.util.Date;
import java.sql.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.demo.entity.Temporal_;
import com.learning.demo.repo.TemporalRepo;

/**
 * @author syamkumarj
 *
 */
@RestController
public class MainController {
	
	@Autowired
	private TemporalRepo tempRepo;
	
	@GetMapping(value="/save")
	public String save() {
		Temporal_ obTemporal = new Temporal_();
		obTemporal.setId(1L);
		Date date = new Date();
		obTemporal.setDatetime_column(date);
		obTemporal.setTimestamp_column(date);
		obTemporal.setDate_column(date);
		obTemporal.setTime_column(date);
		
		obTemporal.setSql_datetime_column(new java.sql.Timestamp(date.getTime()));
		obTemporal.setSql_timestamp_column(new java.sql.Timestamp(date.getTime()));
		obTemporal.setSql_date_column(new java.sql.Date(date.getTime()));
		obTemporal.setSql_time_column(new java.sql.Time(date.getTime()));
		System.out.println("String"+obTemporal.toString());
		tempRepo.save(obTemporal);
		return "done";
	}

}
