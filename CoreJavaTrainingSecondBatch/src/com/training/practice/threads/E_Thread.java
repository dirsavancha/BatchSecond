package com.training.practice.threads;


class Lock{
	
}
public class E_Thread {
	public static void main(String[] args) {
		
		Lock objlock=new Lock();
		
		Thread A=new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (objlock) {
					System.out.println("A1");
					try {
						objlock.wait(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("A2");
					System.out.println("A3");
				}
				
			}
		});
		
		
		Thread B=new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (objlock) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("B1");
					System.out.println("B2");
					System.out.println("B3");
					objlock.notify();
				}
			}
		});
		A.start();
		B.start();
		
	}

}
