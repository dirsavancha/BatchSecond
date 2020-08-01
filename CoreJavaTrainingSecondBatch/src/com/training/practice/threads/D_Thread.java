package com.training.practice.threads;

class D_ThreadClass implements Runnable {

	@Override
	public void run() {

		Thread t = Thread.currentThread();
		for (int i = 1; i <= 2; i++) {
			synchronized (this) {

				System.out.println(i + "" + t.getName());
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

}

public class D_Thread {
	public static void main(String[] args) {
		
		D_ThreadClass obj=new D_ThreadClass();
		
		Thread t1=new Thread( obj);
		Thread t2=new Thread( obj);
		t1.setName("A_thread");// 2 times
		t2.setName("B_thread");// 2 times
		t1.start();
		t2.start();
		
		
		
	}
}
