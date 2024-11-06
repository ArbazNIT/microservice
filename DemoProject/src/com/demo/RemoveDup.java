package com.demo;

public class RemoveDup {

	public static void main(String[] args) {
		
		String str = "arbazkhan";
						char[]arr = str.toCharArray();
						
						for(int i=0;i<arr.length;i++)
						{
							for(int j=0;j<arr.length;j++)
							{
								if(arr[i]==arr[j])
								{
									arr[j]=' ';
								}
							}
						}
						
						for(int i=0;i<arr.length;i++)
						{
							if(arr[i]!=' ')
							{
								System.out.println(arr[i]);
							}
			
							
						}
						
			

	
}

}
