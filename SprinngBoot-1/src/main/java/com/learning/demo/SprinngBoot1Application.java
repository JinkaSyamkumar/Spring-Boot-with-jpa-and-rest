package com.learning.demo;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigurationProperties(value=PropCheck.class)
public class SprinngBoot1Application {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private MyMessage myMessage;
	
	@Autowired
	private PropCheck propcheck;
	
	@Autowired
	private FilePropCheck filePropCheck;
	
	@Value("${mymessage.main}")
	private String message;
	
	@RequestMapping(value="/")
	public String welcome() {
		System.out.println();
		return "Welcome, your lucky number is " + myMessage.getMyMessage()+"---"+message;
	}
	
	@RequestMapping(value="/propCheck")
	public String propCheck() {

		return "Name --- " + propcheck.getName()+"---"+ propcheck.getMail()+"----";
	}
	
	@RequestMapping(value="/filePropCheck")
	public String filePropCheck() {

		return "File Name --- " + filePropCheck.getName()+"---"+ filePropCheck.getMail()+"----";
	}
	public static void main(String[] args) {
		SpringApplication.run(SprinngBoot1Application.class, args);
	}
}
