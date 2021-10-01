import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in = new Scanner (System.in);	
	
	ArrayList <Integer> inputs = new ArrayList<>();
	
	System.out.print("Enter all the elements and then type \"Q\" to quit: ");
	while ( in.hasNextInt()) {
		
		inputs.add(in.nextInt());
		
        
        
		
	    
	        }
	System.out.println("The array is: ");
	System.out.println(inputs);
	    
	
	
        
	
	System.out.println(" Values at an even index: ");
	
	for ( int i = 2; i < inputs.size(); i = i + 2) {
		System.out.println(inputs.get(i));
		
	}
	System.out.println("even values in the array: "); 
	for ( int input: inputs) {
		
		if (input %2 == 0)
			System.out.println(input);
		
	}

	System.out.println("odd values in the array: ");
	
	for (int i = 0; i < inputs.size(); i++) {
		if (inputs.get(i)%2 != 0)
			System.out.println(inputs.get(i));
		
	}
	
	System.out.println("array reversed are: ");
	
	
	
	for ( int i = inputs.size() - 1; i>=0; i--) {
		if (i >=0)
			System.out.print(" | ");
		System.out.print(inputs.get(i) + " ");
	}	
	
	double number = 0;
	double total = 0;
	
	
	for( int i = 0;i<inputs.size();i++) {
		
		  
		number = inputs.get(i);
			if(i%2==0) {
				total = total + number;
			}
			else {
				total = total - number;
			}
	}
		
		
		System.out.println(" ");
		System.out.println("Alternating sum: ");
		System.out.println(total);
	
		/**
		 * largest + smallest in array
		 */
		
		int largest = inputs.get(0);
		int smallest = inputs.get(0);
		
		for ( int input : inputs) {
			
			if ( input > largest) {
				largest = input;
			}
		}
			for ( int input: inputs) {
			
				if (  input < smallest ) {
			
			smallest = input;	
				
			}
			}
		
			System.out.println("Largest element: " + largest );
			System.out.println("smallest elements: " + smallest);
		
		

	
	  int temp= inputs.get(0); 
	
	  int last = inputs.get(inputs.size() -1);
	  int  middle = inputs.get((inputs.size()/2) - 1 );
	  int first = inputs.get(0);
	 
	  
	  System.out.println("\n First Element : " + first + 
			  				"\n Middle Element : " + middle
			  				+ "\n Last Element : " + last);
	  
	  
	  
	  
	  
	  
	  
	
	}
}           	
	     	

           	
            
         
	
	
	
			     

        

  

	
		
	
	
	
	
	

