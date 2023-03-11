package com.oops.abc;

public class Person2 {
	// method with returntype and without arguments

	int add() {

		int a = 10;
		int b = 10;
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {

		Person2 p=new Person2();
		int a=p.add();
		System.out.println(a);
	}
}
