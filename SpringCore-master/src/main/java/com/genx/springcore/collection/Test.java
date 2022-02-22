package com.genx.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/genx/springcore/collection/config.xml");

		Student st = (Student) context.getBean("st");
		Student stSet = context.getBean("stSet", Student.class);
		Student stMap = context.getBean("stMap", Student.class);
		Student stProp = context.getBean("stProp", Student.class);

		System.out.println(st);
		System.out.println(stSet);
		System.out.println(stMap);
		System.out.println(stProp);

	}

}


//list
//set/
//map
//properties