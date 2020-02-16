package com.example.demo.thread;

public class Test01 {
	
public static void main(String[] args) {
	final int a=0;
	for(int i=0;i<50;i++) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				int n=a;
				for(int i=0;i<100;i++) {
					System.out.println(Thread.currentThread().getName()+n++);
				}
			}
		}).start();
	}
	
	for(int i=0;i<100;i++) {
		int n=a;
		System.out.println(Thread.currentThread().getName()+n++);
	}
}
}
