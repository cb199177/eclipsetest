package com.itcast.firstTest;

import com.itcast.domain.Student;

public class helloworld {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("傻逼");
		System.out.println(stu);
		name();
		System.out.println("第一次");
		System.out.println("第二次");
		System.out.println("第三次");
		System.out.println("最后一次");
	}
	public static void name() {
		System.out.println("哈哈");
	}
	
}
