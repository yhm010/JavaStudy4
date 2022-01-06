package com.iu.s3.member;

public class MemberMain {

	public static void main(String[] args) {

		Member member = new Member();
		member.setAge(40);
		member.setEmail("test@gmail.com");
		
		String email = member.getEmail();
		System.out.println(member.getEmail());
		System.out.println(member.getAge());

	}

}