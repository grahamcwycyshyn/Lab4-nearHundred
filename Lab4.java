import java.util.Scanner;

public class Lab4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char answer = 'y';
		
		//Takes user integer input, uses a for loop to print the lists of numbers, squares and cubes
		//Then, it calls the multiplication table method and checks if the user wants to continue
		do {
			
			System.out.println("Enter an integer:");
			
			int integer = input.nextInt();
			
			System.out.printf("%-10s %-10s %-10s\n", "Numbers:", "Squared:", "Cubed:");
			
			System.out.printf("%-10s %-10s %-10s\n", "=======", "=======", "=======");
			
			for(int i = 1; i <= integer; i++) {
				System.out.printf("%-10s %-10s %-10s\n", i, i * i, i * i * i);
			}
			
			printTable(integer);
			
			System.out.println("Would you like to continue? (y/n)");
			
			answer = input.next().charAt(0);
			
		} while(answer == 'y' || answer == 'Y');
		//Will only continue if user enters y or Y
	
		input.close();
		
		}

//nearHundred solution
public boolean nearHundred(int n) {
	  if(Math.abs(100-n) <= 10 || Math.abs(200-n) <= 10){
	    return true;}
	  else{
	    return false;}
	  }

//Multiplication table print method
public static void printTable(int integer) {
	
	  System.out.format("      ");
	   
       for(int i = 1; i <= integer; i++) {
           System.out.format("%4d",i);
       }
       
       System.out.println();
      
       for(int i = 1; i <= integer; i++) {
           System.out.format("%4d  ", i);
           
           for(int j = 1;j <= integer;j++) {
               System.out.format("%4d", i * j);
           }
           
           System.out.println();
       }
   }
}

