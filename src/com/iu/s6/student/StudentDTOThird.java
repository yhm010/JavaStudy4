package com.iu.s6.student;

public class StudentDTOThird extends StudentDTO {

	// 자식클래스

	int physics;

	@Override
	public int setTotal() {
		this.total = this.kor + this.eng + this.math + this.physics;
		System.out.println(this.total);
		return this.total;
	}

	

}
