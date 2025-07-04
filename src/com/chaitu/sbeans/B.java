package com.chaitu.sbeans;

public class B {

	private A a;

	public B(A a) {
		System.out.println("B :: 1 param constuctor");
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", From object B" + "]";
	}

}
