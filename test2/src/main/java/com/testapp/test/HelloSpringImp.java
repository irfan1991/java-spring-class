package com.testapp.test;

import org.springframework.stereotype.Component;

//@Component

public class HelloSpringImp implements HalloSpringService{

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hallo belajar Spring");
		
	}

}
