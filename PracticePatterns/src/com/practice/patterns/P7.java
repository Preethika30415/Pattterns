package com.practice.patterns;

public class P7 
{
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		int k=1;
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.print(k+++" ");
			}
			System.out.println();
		}
	}
}