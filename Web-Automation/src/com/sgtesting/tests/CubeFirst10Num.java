package com.sgtesting.tests;

public class CubeFirst10Num {

	public static void main(String[] args) {
		 int a[]=new int[10];
	       int k=0;
	        for(int j=1;j<=10;j++)
	        {
	          a[k]=j*j*j;
	            k=k+1;
	         }
	        for(int z=a.length-1;z>=0;z--)
	        {
	          System.out.println(a[z]);
	         }
	    }

}
