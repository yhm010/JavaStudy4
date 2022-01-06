package com.iu.s5;

public class MyGod {
	
	private MyGod() {
		
		// 전체 프로그램에서 객체를 딱 하나 만들어서 사용하는 방법 = Singleton (싱글톤)
		// 클래스메서드 (객체 생성 하지 않고 생성 가능)
		// 객체가 딱 하나만 나와야 함.
		
		MyGod myGod;
		System.out.println(myGod);
		
	}

}
