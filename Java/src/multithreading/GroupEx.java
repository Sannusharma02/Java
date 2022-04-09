package multithreading;

class Demo4 extends Thread
{
	public Demo4(ThreadGroup tg, String string) {
		super(tg,string);
	}

	public void run()
	{
		System.out.println(Thread.currentThread().getThreadGroup().getName());
	}
}
public class GroupEx {

	public static void main(String[] args) 
	{
//		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
//		Thread.currentThread().getThreadGroup().getParent().list();;

		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		ThreadGroup tg=new ThreadGroup("jsp");
//		Thread t1 = new Thread(tg,"one");
		
		Thread t1 = new Demo4(tg,"one");
		
		t1.start();
	}

}
