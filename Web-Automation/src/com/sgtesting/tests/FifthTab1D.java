package com.sgtesting.tests;

public class FifthTab1D {

	public static void main(String[] args) {
		int count=0;
	     for(int i=5;i<=50;i++)
	      {
	         if(i%5==0)
	          {
	           count=count+1;
	          }
	      }
	       System.out.println("# of elements:" +count);
	       int a[]=new int[count];
	       int k=0;
	        for(int j=5;j<=50;j++)
	        {
	          if(j%5==0)
	           {
	            a[k]=j;
	            k=k+1;
	            }
	         }
	        for(int z=a.length-1;z>=0;z--)
	        {
	          System.out.println(a[z]);
	         }
	    }

	}
