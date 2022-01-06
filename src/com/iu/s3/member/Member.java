package com.iu.s3.member;

public class Member {

	private String name; // 이름
	private String email; // 이메일
	private double muge; // 몸무게
	private double ki; // 키
	private int age; // 나이

	// setter 변수의 값을 집어넣는 것, getter 변수의 값을 가지고 나가는 것
	// set변수명, get변수명
	// setter
	public void setKi(double ki) {
		this.ki = ki;
	}
		//getter
		public void getKi() {
			return this.ki;
		}
		// setter
		public void setEmail(String email) {
			this.email=email;
		}
		//getter
			public void getEmail() {
				return this.email;
			}
		
	// 나이
	public void setAge(int age) {
		this.age = 20;
		if (age > 0 && age < 200) {
			this.age = age;
		}
	}

	public int getAge() {
		return this.age;
	}

}