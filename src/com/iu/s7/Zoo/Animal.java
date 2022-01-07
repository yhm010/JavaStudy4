package com.iu.s7.Zoo;

public abstract class Animal {

	String name;
	int age;

	public void eat() {
		System.out.println("찹찹찹");
	}

	public abstract void sleep();

}
