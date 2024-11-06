package com.demo;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		
		  String str = "zxwqrkabcd"; 
		  char[] arr = str.toCharArray();
		  
		  for(int i=0;i<arr.length;i++) {
			  char temp=0;
		  
		  for(int j=i+1;j<arr.length;j++) {
			  if(arr[i]>arr[j]) 
			  { 
				  temp=arr[i];
		  arr[i]=arr[j];
		  arr[j]=temp;
		  
		  } }
		  
		  }
		 			System.out.println( arr);
		 			
		 			
					/*
					 * String str1 = "arbazbadskl"; char[] arr1 = str1.toCharArray();
					 * 
					 * Arrays.sort(arr1); System.out.println(arr1);
					 * 
					 */		 			
	}


}
