package me.jatinsingh.test6;

import java.util.concurrent.*;

class MyThreadA extends Thread 
{ 
	Semaphore sem1; 
	Semaphore sem2; 
	public MyThreadA(Semaphore sem1, Semaphore sem2) 
	{ 
		super(); 
		this.sem1 = sem1; 
		this.sem2 = sem2; 
	} 

	@Override
	public void run() { 
		try
		{ 
			System.out.println("A is waiting for a permit of sem1"); 
			sem1.acquire(); 
			System.out.println("A Aquired permit of sem1"); 

			System.out.println("A is waiting for a permit of sem2"); 
			sem2.acquire(); 
			System.out.println("A Aquired permit of sem2"); 

			System.out.println("THREAD A EXECUTED");
		} catch (InterruptedException exc) { 
			System.out.println(exc); 
		} 
		sem2.release(); 
		sem1.release(); 
	} 
} 
class MyThreadB extends Thread 
{ 
	Semaphore sem1; 
	Semaphore sem2; 
	public MyThreadB(Semaphore sem1, Semaphore sem2) 
	{ 
		super(); 
		this.sem1 = sem1; 
		this.sem2 = sem2; 
	} 

	@Override
	public void run() { 
		try
		{ 
			System.out.println("B is waiting for a permit of sem2"); 
			sem2.acquire(); 
			System.out.println("B Aquired permit of sem2");

			System.out.println("B is waiting for a permit of sem1"); 
			sem1.acquire(); 
			System.out.println("B Aquired permit of sem1"); 

			System.out.println("THREAD A EXECUTED");
		} catch (InterruptedException exc) { 
			System.out.println(exc); 
		} 
		sem1.release(); 
		sem2.release(); 
	} 

} 


// Driver class 
public class SemaphoreDeadLock 
{ 
	public static void main(String args[]) throws InterruptedException 
	{ 
		// creating a Semaphore object 
		// with number of permits 1 
		Semaphore sem1 = new Semaphore(1); 
		Semaphore sem2 = new Semaphore(1); 

		// creating two threads with name A and B 
		// Note that thread A will increment the count 
		// and thread B will decrement the count 
		MyThreadA mt1 = new MyThreadA(sem1, sem2); 
		MyThreadB mt2 = new MyThreadB(sem2, sem2); 

		// stating threads A and B 
		mt1.start(); 
		mt2.start(); 

		// waiting for threads A and B 
		mt1.join(); 
		mt2.join(); 
	} 
} 