package com.example.demo.thread;

public class TickRunnable implements Runnable{

	private static int index=1;
	
	@Override
	public void run() {
		while(index<=50) {
			System.out.println(Thread.currentThread().getName()+"****"+index++);
		}
	}

}
