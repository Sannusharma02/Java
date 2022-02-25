package datatype;

public class StaticVariables2 
{
	static int i=2;
	public static void main(String[] args) 
	{
		System.out.println(i);
		StaticVariables2.i=200;
		changedValue();
	}
	public static void changedValue() 
	{
		System.out.println(StaticVariables2.i);
	}
}