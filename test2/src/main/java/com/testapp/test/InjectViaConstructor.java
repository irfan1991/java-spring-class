package com.testapp.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//@Controller
public class InjectViaConstructor {
	
	//menggunakan method constructor
	HalloSpringService halloSpringService;

//	@Autowired
	public InjectViaConstructor(HalloSpringService halloSpringService) {

		this.halloSpringService = halloSpringService;
	}
	
	public void getMessage() {
		halloSpringService.sayHello();
	}
	

}
