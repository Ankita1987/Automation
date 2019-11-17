package Practise;

public class Minimumnumbers {


			public static void main( String[] args )
	    {
			
	
	  
	 int A[][] ={{4,5,6},{7,9,1},{2,0,6}}; 
	 int c=A[0][0];
	 //System.out.println(c);
	            for (int i = 0; i < A.length; i++) 
	        {
	            for (int j = 0; j <2 ; j++) 
	            {
	            	if (c> A[i][j])
	            	{
	            		c=A[i][j];
	            	}
                            
	            	}
	            	
	       
	        }
	            System.out.println(c);   
	            
	    }
	    }
	    
