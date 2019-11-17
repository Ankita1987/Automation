package Practise;


public class Array {
	private static int[][] A;

	public static void main( String[] args )
    {
		
int c=0,j=0;
  
        int[][] arr = { { 1, 2,3 }, { 3, 4,5 },{4,2,5},{5,1,6} }; 
        
            for (int i = 0; i < arr.length; i++) 
        {
            for (j=0; j < 3; j++) 
            {
         c=arr[i][0]+arr[i][1]+arr[i][2];

       
            }
            if(c==6)
            {
            	for (int k = 0; k<3; k++) 
                
            	System.out.print(arr[i][k] + " ");   
            } 
            
        }
    }
}


