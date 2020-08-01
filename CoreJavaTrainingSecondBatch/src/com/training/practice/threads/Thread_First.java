package com.training.practice.threads;

class Dummy {
	void m1() {
		System.out.println("I am Dummy class M1 method without extends Thread class");
	}
}

class A_Thread extends Thread {
	@Override
	public void run() {
		System.out.println("I am  A_Thread class run method");
		System.out.println("current Thread"+Thread.currentThread());
		System.out.println("Current thread Id"+Thread.currentThread().getId());
		System.out.println("Cureent thread Name "+Thread.currentThread().getName());
	}

}

public class Thread_First {
	
	public static void main(String[] args) {

		A_Thread t1 = new A_Thread();
		A_Thread t2=new A_Thread();
		
		System.out.println("T1 thread priority "+t1.getPriority());
		System.out.println("T2 thread priority "+t2.getPriority());
		
		t1.setName("First");
		t1.setPriority(1);
		
		
		t2.setName("Second");
		t2.setPriority(8);
		 
		                 
		
		t1.start();
		t2.start();
	
		
		
		
		

	}

}
