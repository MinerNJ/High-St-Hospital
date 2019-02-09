import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class PatientTest {
	
	@Test
	public void shouldNamePatient(){
		Patient underTest = new Patient("Mark", 123);
		
		String actual = underTest.getName();
		
		assertEquals("Mark", actual);
		
	}
	
	@Test
	public void shouldHaveBlood(){
		Patient underTest = new Patient("Mark", 123);
		
		int actual = underTest.getBLOOD_LEVEL();
		
		assertEquals(20, actual);
		
	}
	
	@Test
	public void shouldhaveHealth(){
		Patient underTest = new Patient("Mark", 123);
		
		int actual = underTest.getHEALTH_LEVEL();
		
		assertEquals(10, actual);
		
	}
	
	@Test
	public void shouldHaveIDNum() {
		Patient newPatient = new Patient(null, 123);
		
		String actual = newPatient.getIDNum();
		
		assertEquals(123, actual);
	}
}
