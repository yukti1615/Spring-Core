package com.genx.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/genx/springcore/ci/config.xml");

		Student st = context.getBean("st", Student.class);

		System.out.println(st);
	}

}
