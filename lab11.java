/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

class MyRunnable implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(5);
			System.out.println("Thread " +Thread.currentThread().getId() + "running");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
        
}
public class lab11 {
    public static void main(String[] args){
        
    
		System.out.println("Runnable");
		MyRunnable mr1=new MyRunnable();
		Thread t1=new Thread(mr1);
		Thread t2=new Thread(mr1);
		Thread t3=new Thread(mr1);
		t1.start();
		t2.start();
		t3.start();

	}
}
 
