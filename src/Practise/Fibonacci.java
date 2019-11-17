package Practise;

import java.util.Scanner;

public class Fibonacci {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,a=1;

		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number");
		int N=scan.nextInt();
for(int i=0;i<=N;i++)
{
	System.out.println(a);
    int sum = a + c;
    a = c;
    c = sum;
	
	
}

	}

}

