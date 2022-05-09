package com.javaex.ex02;

public class LowerThred extends Thread{
	
	public void run() {
		for(char ch = 'a'; ch<'z'; ch++) {
			System.out.println(ch);
		}
	}
}
