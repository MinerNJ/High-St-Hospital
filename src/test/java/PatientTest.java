import static org.junit.Assert.assertEquals;

import org.junit.Test;

import employees.Patient;
import junit.framework.Assert;

public class PatientTest {
	
	Patient newPatient = new Patient("Mark", null);

	@Test
	public void shouldNamePatient(){
		String actual = newPatient.getName();
		assertEquals("Mark", actual);
	}
	
	@Test
	public void shouldHaveBlood(){		
		int actual = newPatient.getBLOOD_LEVEL();
		assertEquals(20, actual);
	}
	
	@Test
	public void shouldhaveHealth(){		
		int actual = newPatient.getHEALTH_LEVEL();
		assertEquals(10, actual);
	}
	
	@Test
	public void shouldHaveIDNum() {	
		Patient specificTest = new Patient(null, "123");
		String actual = specificTest.getIDNum();
		assertEquals("123", actual);
	}
	
	@Test
	public void shouldWorsenWithTick() {
		int beforeWorsen = newPatient.getBLOOD_LEVEL();
		newPatient.worsenWithTick(5);
		int actual = newPatient.getBLOOD_LEVEL();
		assertEquals(beforeWorsen - 1, actual);
	}
}
