/**
 * 
 */
package com.learning.demo;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author syamkumarj
 *
 */
@Configuration
public class ApplicationConfiguration {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	@Bean
	@Profile("prod")
	public MyMessage myMessage(@Value("${mymessage.value}") String messageValue) {
		
		MyMessage myMessage = new MyMessage();
		myMessage.setMyMessage(messageValue);
		return myMessage;
	}
	@Bean
	@Profile("dev")
	public MyMessage myMessageDev(@Value("${mymessage.value}") String messageValue) {
		
		MyMessage myMessage = new MyMessage();
		myMessage.setMyMessage(messageValue+"Dev");
		return myMessage;
	}
}
