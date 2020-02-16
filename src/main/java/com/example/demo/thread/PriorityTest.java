package com.example.demo.thread;

public class PriorityTest {
public static void main(String[] args) {
	Thread t1 = new Thread(new Runnable() {
		@Override
		public void run() {
			for(int i=0;i<100;i++) {
				System.out.println(Thread.currentThread().getName()+"***"+i);
			}
		}
	});
	t1.setPriority(Thread.MAX_PRIORITY);
	t1.start();
	
	Thread t2 = new Thread(new Runnable() {
		@Override
		public void run() {
			for(int i=0;i<100;i++) {
				System.out.println(Thread.currentThread().getName()+"***"+i);
			}
		}
	});
	t2.setPriority(Thread.MIN_PRIORITY);
	t2.start();
	
	Thread t3 = new Thread(new Runnable() {
		@Override
		public void run() {
			for(int i=0;i<100;i++) {
				System.out.println(Thread.currentThread().getName()+"***"+i);
			}
		}
	});
	t3.start();
	
	
}
}
