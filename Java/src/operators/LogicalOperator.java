package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=19,b=10;
		System.out.println(a%2==0&&b>=6);
		System.out.println(a%2==0||b>=6);
		System.out.println(!(a%2==0));
	}

}
