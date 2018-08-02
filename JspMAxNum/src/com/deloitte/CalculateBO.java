package com.deloitte;

public class CalculateBO {
	public int[] maxof(int n1,int n2)
	{
		int[] a=new int[2];
		if(n1>n2)
			{a[0]=n1;
			a[1]=n2;}
		else
			{a[0]=n2;
			a[1]=n1;}
		return a;
	}
}
