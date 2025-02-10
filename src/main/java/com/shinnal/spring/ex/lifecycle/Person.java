package com.shinnal.spring.ex.lifecycle;

public class Person {
	
	// 이름, 나이에 대한 멤버변수
	private String name;
	private int age;
	
	// 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메소드
	
	@Override
	public String toString() {
		return "이름 : " + name + " 나이 : " + age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	

}
