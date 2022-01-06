package com.iu.s3.member;

public class MemberMain {

	public static void main(String[] args) {

		Member member = new Member();
		member.setAge(40);
		member.setKi(100);

		System.out.println(member.getAge());
		System.out.println(member.getKi());

	}

}