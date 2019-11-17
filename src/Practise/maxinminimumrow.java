package Practise;

public class maxinminimumrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int A[][] ={{4,5,6},{7,9,1},{2,0,6}}; 
		 int c=A[0][0];
		 int minimucolumn=A[0][0],j ;
		 int b=3;
		 //System.out.println(c);
		            for (int i = 0; i < A.length; i++) 
		        {
		            for (j = 0; j <2 ; j++) 
		            {
		            	if (c> A[i][j])
		            	{
		            		c=A[i][j];
		            		minimucolumn=j;
		            		//System.out.println(minimucolumn);  
		            	}
		              // System.out.println(minimucolumn);
		            	}
		           
		        
		           
		        }
		        
		           for (int k=0;k<A.length;k++)
		            {        	  
		        	   
		        	   if (b< A[k][minimucolumn])
		            	{
		            		b=A[k][minimucolumn];
		            		
		            		 
		            	}  
		        	   
		            }
		   
		           System.out.println(b);    
		    }

		    }
		    
