import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class twoD_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int [] [] array1 = { {0, 1, 2, 3}, {1,2,3,4}, {2,3,4,5}, {3,4,5,6}};
		  
			
		
		  int arraySum = 0; 
		  int sumRow = 0;
		  int sumCol =0;
		  int elementSum = 0;	  
		  
		for (int row = 0; row < array1.length; row++)
		{
			for (int column = 0; column < array1.length; column++)
			{
				
				System.out.print(array1[row][column] + "  "); 
						}
			
			System.out.println(" \n ");
			
			
			
		}
		
		for(int i = 0; i < Array.getLength(array1); i++){  
            sumRow = 0;  
            for(int j = 0; j < array1.length; j++){  
              sumRow = sumRow + array1[i][j]; 
             
            }  
            System.out.println("----------------");
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);  
        }  
          
        //Calculates sum of each column of given matrix  
        for(int i = 0; i < Array.getLength(array1); i++){  
            sumCol = 0;  
            for(int j = 0; j < array1.length; j++){  
              sumCol = sumCol + array1[j][i];  
             
            }  
            System.out.println("----------------");
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);  
        }  
    
        for(int counter =0; counter< array1.length; counter++) {

  			 for(int j=0; j < array1[0].length; j++) {
  		 elementSum = elementSum + array1[counter][j];
  		 }     
  		 }

  		
  	    
        System.out.println("----------------");	        
        System.out.println("sum of all elements: ");
        System.out.println(elementSum); 
	
	}  
}  
					 
		
		
		
				
		
	
		
	


