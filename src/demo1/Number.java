package demo1;

public class Number extends Thread
{
	int st,end;
	public Number(int st,int end)
	{
		this.st=st;
		this.end=end;
	}

	@Override
	public synchronized void start()//no need to override start method 
	{
		System.out.println("Hello");
		
	}

}
