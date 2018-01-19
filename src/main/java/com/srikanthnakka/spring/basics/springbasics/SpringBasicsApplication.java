package com.srikanthnakka.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(SpringBasicsApplication.class, args);
		 
		 BinarySearchImpl binarySearchImpl = context.getBean(BinarySearchImpl.class);
		 
		 int result = binarySearchImpl.binarySearch(new int[]{2,5,3,6,2}, 3);
		 System.out.println("result " +result);
		 
	}
}
