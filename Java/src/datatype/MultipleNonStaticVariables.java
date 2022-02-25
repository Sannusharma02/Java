package datatype;

public class MultipleNonStaticVariables {
	int i=1;
	public static void main(String[] args) {
		MultipleNonStaticVariables mnsv1=new MultipleNonStaticVariables();
		mnsv1.i=1;
		
		MultipleNonStaticVariables mnsv2=new MultipleNonStaticVariables();
		mnsv2.i=2;
		
		MultipleNonStaticVariables mnsv3=new MultipleNonStaticVariables();
		mnsv3.i=3;
		
		System.out.println(mnsv1.i);
		System.out.println(mnsv2.i);
		System.out.println(mnsv3.i);
	}
}
