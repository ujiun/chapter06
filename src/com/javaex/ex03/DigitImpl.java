package com.javaex.ex03;

public class DigitImpl implements Runnable{
	
	public void run() {
		
		for(int i=0; i<9; i++) {
			
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
