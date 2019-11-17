package Practise;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Updating in GIT
		//HHIIIIIIIIIIIIIII
		Armstrong();
	}
public static void Armstrong()
{
		int A=153,f=0;
				while(A!=0)
				{
				int c=0,d=0;
				c=A%10;
				A=A/10;
				d=c*c*c;
				f=f+d;
								
				}
				System.out.println(f);
				
	}

}
