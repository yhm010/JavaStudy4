package com.iu.s4;

public class Square {
	public static int sero = 1; // 대부분 많이 봄. 이 변수는 이제 멤버변수가 아니다. 공통의 클래스의 변수
	int garo;

	static {
		Square.sero = 3;
	}

	public static void info() {
		System.out.println("Class Mathod");
//	System.out.println(this.garo);
		System.out.println(Square.sero);
//	this.info2();

	} // 메인 끝

	public void info2() {
		final int num = 1;
		System.out.println("Instance Method");
		System.out.println(this.garo);
		System.out.println(Square.sero);
		Square.info();
	}

} // 클래스 끝
