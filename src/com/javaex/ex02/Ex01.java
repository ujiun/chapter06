package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		Thread thread1 = new DigitThread();
		Thread thread2 = new LowerThred();
		Thread thread3 = new UpperThred();
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
