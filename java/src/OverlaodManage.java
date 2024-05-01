public class OverlaodManage
{
	void show(int ab,byte b1)
	{
		System.out.println("*show(int,byte)* "+ab+" "+b1);
	}
		void show(byte b1,int ab){
		System.out.println("*show(byte,int)*");
	} 
	void display(String str)
	{
		System.out.println("--display(String)---");
	}
	void display(Object obj)
	{
		System.out.println("---display(Oject)---");
	}
	void showValues(String str)
	{
		System.out.println("---showValues(String)");
	}
	void showValues(int[] arr)
	{
		System.out.println("---showValues(int[])---");
	}
}