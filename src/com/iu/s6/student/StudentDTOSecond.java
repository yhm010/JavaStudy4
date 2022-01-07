package com.iu.s6.student;

public class StudentDTOSecond extends StudentDTO {

	// 안보이지만 StudentDTO 데이터가 있음.

	int history;
	
	public int setTotal() {
		//오버라이딩
		this.total = this.kor + this.eng + this.math + this.history;
		System.out.println(this.total);
		return this.total;
	}

}
