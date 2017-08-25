package com.importNew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		 
        IHelloWorld obj = context.getBean("helloWorld",IHelloWorld.class);
 
        obj.printMessage();
	}
}
