package com;

public class Test {
	public static int ak=0;
	public static void main(String[] args) {
		System.out.println(ak);
		getNum();
	}
	
	private static void getNum() {
		try {
			System.out.println(ak);
			System.out.println("你好");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
