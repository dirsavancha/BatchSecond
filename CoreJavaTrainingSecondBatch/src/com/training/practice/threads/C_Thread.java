package com.training.practice.threads;



class C_ThreadClass implements Runnable {

	@Override
	public void run() {
		Thread t=Thread.currentThread();
		
		for(int i=1;i<5;i++) {
			System.out.println(i+""+t.getName());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class C_Thread {
	public static void main(String[] args) {
		
		C_ThreadClass obj=new C_ThreadClass();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("A_thread");
		t2.setName("B_thread");
		t1.start();
		t2.start();
				
	}

}
