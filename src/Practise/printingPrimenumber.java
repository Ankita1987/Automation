package Practise;
import java.lang.Math;
import java.util.Scanner; 
public class printingPrimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=20,count, status = 1,num=3, j;
		 
	    	      System.out.println("Enter the number of prime numbers you want");
	      	     
	      if (n >= 1)
	      {
	         System.out.println("First "+n+" prime numbers are:");
	         System.out.println(2);
	      }
	     
	      for (count = 2; count <=n;)
	      {
	         for (j = 2; j <= Math.sqrt(num); j++)
	         {
	            if (num%j == 0)
	            {
	               status = 0;
	               break;
	            }
	         }
	         if (status != 0)
	         {
	            System.out.println(num);
	           	            count++;
	         }
	         status = 1;
	         num++;
	      	     
	        }        
	   }
	}