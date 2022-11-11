package jenkinsgruppo2;


import java.util.InputMismatchException;

import org.junit.Rule;
import org.junit.jupiter.api.*;
import org.junit.rules.ExpectedException;
import org.junit.jupiter.api.BeforeEach;
import myJenkTest.tutorial.FizzBuzz;


public class jenkinsgruppo2test {
	
	public FizzBuzz fb;
	
	@BeforeEach 
	public void setup()	{
		fb=new FizzBuzz();
		
	//commento 
		
	}
	
	@DisplayName("Play FizzBuzz with number=1")
	@Test
	public void testNumber() {
		String risultato=fb.play(1);
		//assertEquals(risultatoOttenuto, risultatoPianificato)
		Assertions.assertEquals(risultato, "1");
		
	}
	
	@DisplayName("Play FizzBuzz with number=3")
	@Test
	public void testFizz() {
		String risultato=fb.play(3);
		Assertions.assertEquals(risultato,"Fizz");	
	
	}	
	
		@DisplayName("Play FizzBuzz with number=1")
		@Test
		public void testNumber1() {
			String risultato=fb.play(5);
			//assertEquals(risultatoOttenuto, risultatoPianificato)
			Assertions.assertEquals(risultato, "Buzz");
			
		}


		@DisplayName("Play FizzBuzz with number=1")
		@Test
		public void testNumber3() {
			String risultato=fb.play(0);
			//assertEquals(risultatoOttenuto, risultatoPianificato)
			Assertions.assertEquals(risultato, "Number must not be 0");
			
		}

		@DisplayName("Play FizzBuzz with number=1")
		@Test
		public void testNumber4() {
			int tastiera = 0;
			String risultato=fb.play(tastiera);
			//assertEquals(risultatoOttenuto, risultatoPianificato)
			Assertions.assertEquals(risultato, "risultato");
			
		}
		
		@Rule
	    public ExpectedException thrown = ExpectedException.none();    
	    @Test
	    public void testFooThrowsIndexOutOfBoundsException() {
	        thrown.expect(InputMismatchException.class);
	        thrown.expectMessage("ti ho detto di inserire un intero!");
	        fb.play("Ciao");
	    }
		
		}


