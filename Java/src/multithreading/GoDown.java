package multithreading;

public class GoDown {
	
	int noOfItems=100;
	static GoDown g;
	
	private GoDown(){}
	
	public static GoDown getOb()
	{
		if (g==null) 
		{
			g=new GoDown();
		}
		return g;
	}

	public synchronized void purchase(int amt)
	{
		while(amt>noOfItems)
		{
			System.err.println("Please wait.....");	
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
			try {
				this.wait(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		noOfItems=noOfItems-amt;
		System.out.println("Purchase Made");
	}

	public synchronized void update(int amt) {
		noOfItems=noOfItems+amt;
		System.out.println("Products Updated");
		
	}
}
