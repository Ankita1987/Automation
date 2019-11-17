package Practise;

import java.util.Scanner;

public class IntegerPalindrome {
	private static int C;
	static int D;
	@SuppressWarnings({ "unlikely-arg-type", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int N=1234;
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Enter any number: ");

	        // This method reads the number provided using keyboard
	        int N = scan.nextInt();
	        	        System.out.print("Enter any Value to compare: ");

	        // This method reads the number provided using keyboard
	        D = scan.nextInt();
		Pallindrome(N);
		IntegerPalindrome a=new IntegerPalindrome();
	
	if (PallindromeCheck()==true)
System.out.println("YES");
	else System.out.println("NO");
	}
	static boolean PallindromeCheck() {
		// TODO Auto-generated method stub
			if(D==C)
			return true;
			else return false;
	}
			
	
	static int Pallindrome(int A) {
	int B=0;
	while (A != 0) {
        int remainder = A % 10;
    	
        A=A/10;
        B = B * 10 + remainder;
        C=B;
        
	}
	return C;
    }
}