package multithreading;

class Output
{
	public synchronized static void printNumber()
	{
		for(int i=1;i<=50;i++)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public synchronized static void printCharacter()
	{
		for(char i='a';i<='z';i++)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

class One extends Thread
{
	public void run()
	{
	Output.printNumber();	
	}
}

class Two extends Thread
{
	public void run()
	{
	Output.printCharacter();;	
	}
}

public class ClassLevellock {

	public static void main(String[] args) {
		Thread tn= new One();
		Thread tc= new Two();
		tn.start();
		tc.start();
	} 
}
