package jenkinsgruppo2;


import org.junit.jupiter.api.*;

import jenkinsgruppo2.esercizio.FizzBuzz;

public class jenkinsgruppo2test {
	
	public FizzBuzz fb;
	
	@BeforeEach 
	public void setup()	{
		fb=new FizzBuzz();
		
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
		public void testNumber2() {
			String risultato=fb.play(1);
			//assertEquals(risultatoOttenuto, risultatoPianificato)
			Assertions.assertEquals(risultato, "5");
			
		}
	

		@DisplayName("Play FizzBuzz with number=1")
		@Test
		public void testNumber3() {
			String risultato=fb.play(0);
			//assertEquals(risultatoOttenuto, risultatoPianificato)
			Assertions.assertEquals(risultato, "Number must not be 0");
			
		}
	
}
