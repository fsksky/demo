package com.example.demo.thread;

public class TestMain {
public static void main(String[] args) {
	/*
	TickRunnable runnable = new TickRunnable();
	Thread th1 = new Thread(runnable, "一号窗口");
	Thread th2 = new Thread(runnable, "二号窗口");
	Thread th3= new Thread(runnable, "三号窗口");
	
	th1.start();
	th2.start();
	th3.start();
	*/
	
	Thread th1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				System.out.println("*****");
			}
		}
	});
	th1.setDaemon(true);
	th1.start();
	//th1.setPriority(newPriority);
	
	try {
		Thread.sleep(50_000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}
