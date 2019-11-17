package Practise;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Printing Forward Pyramid");
		//forwardpyramid();	
		System.out.println("Printing Reverse Pyramid");
		reversepyramid();
		}
		static void forwardpyramid() {
		int k=1;
		for(int i=0;i<5;i++)
		{
		
			for(int j=1;j<5-i;j++)
			{
							System.out.print(k);
							System.out.print("\t");
							
			k++;
			
		}
		System.out.println();
	}
		}
		static void reversepyramid() {
			int l=3;
			for(int i=1;i<5;i++)
			{
			for(int j=1;j<=i;j++)
			{
								System.out.print(l);
								System.out.print("\t");
								l=l+3;
								
								
			}
			System.out.println();
		}
}
}