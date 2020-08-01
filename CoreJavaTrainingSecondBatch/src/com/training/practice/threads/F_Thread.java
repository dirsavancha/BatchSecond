package com.training.practice.threads;

class ThreadJoining extends Thread{
	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			try {
				Thread.sleep(500);
				System.out.println("Current Thread Name is from run method :"+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println("Exception has been caught "+e);
			}
		}
	}
}

public class F_Thread  {
	public static void main(String[] args) throws InterruptedException {
		ThreadJoining t1=new ThreadJoining();
		ThreadJoining t2=new ThreadJoining();
		ThreadJoining t3=new ThreadJoining();
		
		t1.setName("A");
		t2.setName("B");
        t3.setName("C");
        
        t1.start();
        System.out.println(t1.isAlive());//live
        t1.join();
        System.out.println(t1.isAlive());//dead
        t3.start();
        t2.join();
        
        t2.start();
        System.out.println(t3.isAlive());
		
	}
	
	

}
