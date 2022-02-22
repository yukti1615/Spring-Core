package com.genx.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/genx/springcore/config.xml");

		Employees emp = context.getBean("emp", Employees.class);

		System.out.println(emp);
	}
}
