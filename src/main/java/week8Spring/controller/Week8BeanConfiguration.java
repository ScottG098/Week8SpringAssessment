package week8Spring.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import week8Spring.beans.House;

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Mar 17, 2023
 */

@Configuration
public class Week8BeanConfiguration {

	@Bean
	public House contact() {
		House bean = new House("987 5th Avenue");
		return bean;
	}
}
