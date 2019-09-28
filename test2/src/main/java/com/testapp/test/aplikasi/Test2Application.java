package com.testapp.test.aplikasi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.testapp.test.InjectViaConstructor;
import com.testapp.test.InjectViaSetter;

@SpringBootApplication
@ImportResource("classpath:/config/configSpring.xml")
//@ComponentScan("com.testapp.test")
public class Test2Application {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Test2Application.class, args);
		InjectViaConstructor halloSpringController = (InjectViaConstructor) context.getBean("injectViaConstructor");
		halloSpringController.getMessage();
		
		InjectViaSetter injectViaSetter = (InjectViaSetter) context.getBean("injectViaSetter");
		injectViaSetter.getMessage();
	}

}
