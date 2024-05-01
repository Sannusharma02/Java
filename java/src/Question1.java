
public class Question1 {
	static int LastDigit(int N)
	{
	    for(int i=1; i<=10000;i++)
	    {
	        while (N >= 10)
	        {
	            N=N%10;
	            System.out.println(N);
	        }   
	    }
	    return 0;
	}
	public static void main(String[] args) {
		LastDigit(1990);
	}

}
