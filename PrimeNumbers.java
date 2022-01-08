package org.logical;

public class PrimeNumbers {

	public static void main(String[] args) {
	
		int i = 0;
		int num = 0;
		int temp = 0;
		
		for(i=1;i<=100;i++)
		{
			int count = 0;
			for (num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					count = count+1;
					
				}
			}
			if (count ==2)
			{
				System.out.println("prime number is "+temp);
			}
		}
			
	System.out.println("prime number form 1 to 100 are :");
	System.out.println(temp);
		
}
	
	}
