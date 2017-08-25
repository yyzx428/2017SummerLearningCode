package com.Aop;


public class HelloWorldAop {
	public void before() {
		System.out.println("Hello World is comming");
	}
	
	public void after() {
		System.out.println("Hello World is gone");
	}
}
