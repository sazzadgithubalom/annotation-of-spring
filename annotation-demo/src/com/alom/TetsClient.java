package com.alom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TetsClient {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College c = (College) ac.getBean("college");
		c.display();
	}

}
