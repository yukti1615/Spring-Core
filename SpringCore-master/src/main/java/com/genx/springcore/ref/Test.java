package com.genx.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/genx/springcore/ref/config.xml");

		A a = context.getBean("aref", A.class);

		System.out.println(a.getX());
		System.out.println(a.getOb().getY());
	}

}
