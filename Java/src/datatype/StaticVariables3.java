package datatype;

public class StaticVariables3 
{
	static int i=3;
	public static void main(String[] args) 
	{
		System.out.println(i);
		int i=300;
		System.out.println(i);
		System.out.println(StaticVariables3.i);
	}

}
