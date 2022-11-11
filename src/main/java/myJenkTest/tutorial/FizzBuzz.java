package myJenkTest.tutorial;
import java.util.InputMismatchException;
import java.util.Scanner;


public class FizzBuzz {
	 public String play(int number) {
		 
		 if(number == 0) {
			 System.out.println(number);
			 throw new IllegalArgumentException("Number must not be 0");		 
		 }
		 if(number%3 ==0) return "Fizz";
		 if(number%5 ==0) return "Buzz";
		 return String.valueOf(number);
	 }
	 
	 

		public String play () {
			try (Scanner tastiera = new Scanner (System.in)) {
				System.out.println("Ciao Utonto , inserisci un numero in modo tale da non fare nulla");
				int number = 0;
				try {
					
					number= tastiera.nextInt();
				
					if (number==0) throw new  IllegalArgumentException("Number must not be 0");
					if (number%3==0)
						return "Fizz";
					if (number%5==0)
						return "Buzz";
				}catch (InputMismatchException e) {
					throw new InputMismatchException("ti ho detto di inserire un intero!");
				}
				
				
				return String.valueOf(number);
			}
		}
		
		
		
		
		
		
		
		
		
		public String play(String number) {
			try {
				float int_number = Float.parseFloat(number);
				return play( int_number);
			}catch(InputMismatchException e) {
				throw new InputMismatchException("ti ho detto di inserire un intero!");
			}catch(NumberFormatException e) {
				throw new NumberFormatException("ti ho detto di inserire un intero!");
			}
			 
		 }
		/*
		public String play(Double number) {
			try {
				float float_number = number.floatValue();
				return play( float_number);
			}catch(InputMismatchException e) {
				throw new InputMismatchException("ti ho detto di inserire un intero!");
			}
			 
		 }*/
		
		public String play(Float number) {
			try {
				if(Math.ceil(number) != number) {
					return "ti ho detto di inserire un intero!";
				}
				int int_number = Math.round(number);
				return play( int_number);
			}catch(InputMismatchException e) {
				throw new InputMismatchException("ti ho detto di inserire un intero!");
			}
			 
		 }
}
