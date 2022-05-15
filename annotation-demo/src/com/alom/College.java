package com.alom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Value("${university.name}")
	private String universityName;
	@Autowired
	private Principal principal;
	
	

	public void display() {
		principal.principalInfo();
		System.out.println("Imps College of Engineer and Technology! ");
		System.out.println("Univercity name is "+universityName);
	}


}
