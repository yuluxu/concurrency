package com.yuluxu.concurrency.ch3;

public class NoAtomic
{
	private static long number;
	
	public static void main(String[] args)
	{
		ReaderThread reader;
		WriterTread writer;
		
		for(int i= 0;i<1000;i++)
		{
			reader = new ReaderThread();
			writer = new WriterTread();
			
			writer.start();
			reader.start();
		}
	}
	
	private static class ReaderThread extends Thread
	{
		@Override
		public void run()
		{
			System.out.println(number);
		}
	}
	
	private static class WriterTread extends Thread
	{	
		@Override
		public void run()
		{
			number = System.currentTimeMillis();
		}
	}
}
