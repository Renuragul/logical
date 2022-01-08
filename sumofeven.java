package org.logical;

public class sumofeven {
public static void main(String[] args) {
	
	int sum = 0;
	for (int i=10;i<=100;i++)
	{
		if(i%2==0) {
			
			System.out.println(i);
			sum=sum+i;
			
		}
		
	}
	System.out.println("sum of even numbers is " +sum);
	
	}
}
