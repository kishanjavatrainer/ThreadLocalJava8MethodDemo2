package com.infotech.client;

public class ClientTest {

	public static void main(String[] args) {
		ThreadLocalDemo demo = new ThreadLocalDemo();
		Thread thread1 = new Thread(demo, "Thread-1");
		Thread thread2 = new Thread(demo, "Thread-2");
		
		thread1.start();
		thread2.start();
	}
}
