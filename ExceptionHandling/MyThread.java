class MyThread extends Thread
{
	public void run()
	{
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException handled");
		}
		for(int i = 1; i<=10; i++)
			System.out.println("ramesh "+ i);
	}
}

class Demo1
{
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
		t1.start();
		for(int i = 1; i<=10; i++)
		{
			System.out.println("main "+i);
			if(i==5)
				t1.interrupt();
		}
	}
}