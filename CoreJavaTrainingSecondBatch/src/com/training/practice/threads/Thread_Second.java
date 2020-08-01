package com.training.practice.threads;

class B_Thread extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}
}

public class Thread_Second {
	public static void main(String[] args) {
		B_Thread obj=new B_Thread();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		
		t1.setName("A_Thread");
		t2.setName("B_Thread");
		
		System.out.println("Min priority "+Thread.MIN_PRIORITY);
		System.out.println("Norm priority "+Thread.NORM_PRIORITY);
		System.out.println("Max priority "+Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		
	}
	

}
