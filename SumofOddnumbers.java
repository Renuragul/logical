package org.logical;

public class SumofOddnumbers {
	public static void main(String[] args) {
		
		int sumodd = 0;
		for (int i=10;i<=100;i++)
		{
			if(i%2==1) {
				
				System.out.println(i);
				sumodd=sumodd+i;
				
			}
			
		}
		System.out.println("sum of odd numbers is " +sumodd);
		
			
	}

}
