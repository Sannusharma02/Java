package datatype;

public class SharedNonStaticVariable {
	int i;
	int j;
	public static void main(String[] args) {
		SharedNonStaticVariable s1=new SharedNonStaticVariable();
		SharedNonStaticVariable s2=new SharedNonStaticVariable();
		s1.j=10;
		s2.j=20;
		System.out.println(s1.j);
		System.out.println(s2.j);
		
		s1.i=30;
		s2.i=40;
		System.out.println(s1.i);
		System.out.println(s2.i);
	
	}

}
