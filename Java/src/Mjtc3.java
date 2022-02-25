class Mjtc3
{
	public static void main(String[] args)
	{
		byte by1=123;
		
		OverlaodManage mngr=new OverlaodManage();
		
		mngr.show(12,by1);
		mngr.show(by1,123);
//		mngr.show(by1,by1);
		mngr.show((int)by1,by1);
		mngr.show(by1,(int)by1);
		
		String str=null;
		Object obj=null;
		int arr[]=null;
		mngr.display(str);
		mngr.display(obj);
		mngr.display(arr);
		mngr.display(null);
		mngr.showValues(arr);
		mngr.showValues(str);
		//mngr.showValues(null);
		mngr.showValues((String)null);
		mngr.showValues(arr);
	}
}
