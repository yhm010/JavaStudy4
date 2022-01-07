package com.iu.s6.student;

public abstract class StudentDTO {
	// 데이터 운반 // 부모클래스

	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	
	public abstract int setTotal();

}
