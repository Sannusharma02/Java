package com.oar.arrays;

public class IteratingForEachLoop {

	public static void main(String[] args) 
	{
		int[][] arr= new int[3][4];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[0][3]=40;
		arr[1][0]=50;
		arr[1][1]=60;
		arr[1][2]=70;
		arr[1][3]=80;
		arr[2][0]=90;
		arr[2][1]=11;
		arr[2][2]=22;
		arr[2][3]=33;
				
		System.out.println("Initiating a forEach loop");
		for(int[] a : arr)
		{
			for(int num: a)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
