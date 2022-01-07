package com.iu.s9.himart;

public class HimartMain {

	public static void main(String[] args) {
		// Tv, Computer, Phone 정보 입력
		
		Computer computer = new Computer();
		computer.company="삼성";
		computer.brand="갤럭시북";
		computer.cpu="7";
		computer.price=200;
		computer.point=2;
		
		Phone phone = new Phone();
		phone.company="아이폰";
		phone.brand="아이폰13";
		phone.pixel=8;
		phone.price=300;
		phone.point=3;
		
		Tv tv = new Tv();
		tv.company="엘지";
		tv.brand="그램";
		tv.size=9;
		tv.price=400;
		tv.point=4;
		
		Client iu = new Client();
		iu.money=1000;
		iu.point=0;
		iu.buy(computer);
	}

}
