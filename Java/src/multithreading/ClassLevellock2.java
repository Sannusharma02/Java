package multithreading;

class Output2
{
	public void printNumber()
	{
		System.out.println(Thread.currentThread().getName()+" started ");
		
		synchronized (this) 
		{	
			for(int i=1;i<=50;i++)
			{
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}
		System.out.println(Thread.currentThread().getName()+" finished execution");
	}
//	public void printCharacter()
//	{
//		for(char i='a';i<='z';i++)
//		{
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(i);
//		}
//	}
}

class One1 extends Thread
{
	Output2 p;
	
	One1(Output2 k)
	{
		p=k;
	}
	public void run()
	{
	p.printNumber();	
	}
}

class Two1 extends Thread
{
	Output2 p;
	
	Two1(Output2 k)
	{
		p=k;
	}
	public void run()
	{
	p.printNumber();	
	}
}

public class ClassLevellock2 {

	public static void main(String[] args) {
		Output2 m=new Output2(); 
		Thread tn= new One1(m);
		Thread tc= new Two1(m);
		tn.setName("thread one");
		tc.setName("thread two");
		tn.start();
		tc.start();
	} 
}
