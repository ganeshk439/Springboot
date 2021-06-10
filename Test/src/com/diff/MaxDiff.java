package com.diff;

public class MaxDiff {

	public static void main(String[] args) {
		int a[]= {10,11,4,12,14};
		int n=0;
		n=a.length-1;
		findMaxDiff(n,a);

	}

	private static void findMaxDiff(int n, int[] a) {
		int b[]=new int[a.length-1];
		for(int i=0;i<b.length;i++) {
			if(i>b.length)
				break;
			else
				b[i]=Math.abs(a[i]-a[i+1]);
		
	}
	int min=b[0], max=b[0],sum=0;
		for(int j=0;j<b.length;j++) {
			if(max<b[j])
				max=b[j];
			if(min>b[j])
				min=b[j];
			sum=sum+b[j];
			
	}
      System.out.println("max is "+ max);
      System.out.println("min is "+min);
     System.out.println(max-min);
     System.out.println(sum);
}}
