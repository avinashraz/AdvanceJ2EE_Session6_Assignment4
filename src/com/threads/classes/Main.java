package com.threads.classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		try
	      {
	         while(mt.isAlive())
	         {
	           System.out.println("Main thread will be alive till the child thread is live");
	           Thread.sleep(1500);
	         }
	      }
	      catch(InterruptedException e)
	      {
	        System.out.println("Main thread interrupted");
	      }
	      System.out.println("Main thread's run is over" );
	   }
	}


