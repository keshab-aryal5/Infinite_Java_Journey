package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1: Launch a Spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//		var context = new AnnotationConfigApplicationContenxt(HelloWorldConfiguration.class)
		//2: Configure the things that we want Spring to manage - @Configuration
		// HelloWorld
		context.getBean("name");
		System.out.println(context.getBean("name"));
	}

}