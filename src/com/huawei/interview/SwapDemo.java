package com.huawei.interview;

import java.util.Arrays;

public class SwapDemo{

	public static void main(String[] args){
		int[] b=new int[]{1,2,3};
		Double[] c=new Double[]{1.6,7.8};
		int [] a = new int[]{
						(int)(Math.random() * 1000),
						(int)(Math.random() * 1000),
						(int)(Math.random() * 1000),
						(int)(Math.random() * 1000),						
						(int)(Math.random() * 1000)																		
		};	
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(a));
		swap(a);
		System.out.println(Arrays.toString(a));		
	}
	
	public static void swap(int a[]){
		int len = a.length;
		for(int i=0;i<len/2;i++){
			int tmp = a[i];
			a[i] = a[len-1-i];
			a[len-1-i] = tmp;
		}
	}
}

