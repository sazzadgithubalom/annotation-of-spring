package com.alom;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.alom")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
/*
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean(name={"colBean","collegeBean", "myCollege"})
	public College collegeBean() {
		College college = new College();
		return college;
	}
	*/
}

//@Component is use to crate for the object by container
//@Configuration is use to configure the class with @Bean
//@ComponentScan is use to scan base package 
//@Autowired is use to inject the object with another object
//@Value is use to inject the value for literals 
//@PropertySource is use to search a property file