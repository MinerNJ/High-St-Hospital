package employeeTests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import employees.Patient;
import employees.VampireJanitor;

public class VampireJanitorTest {

	VampireJanitor newEmployee = new VampireJanitor(null, null, false, false);
	
	@Test
	public void shouldGetThirst() {
		boolean actual = newEmployee.isThirsty();
		assertEquals(true, actual);
	}
	
	@Test
	public void shouldCalculatePay() {		
		String actual = newEmployee.calculatePay();
		assertEquals("Unlimited access to the Blood Bank", actual);
	}
	
	@Test
	public void shouldDrainBlood() {
		VampireJanitor newEmployee = new VampireJanitor(null, null, false, true);
		Patient newPatient = new Patient (null, null);
		int beforeDrain = newPatient.getBLOOD_LEVEL();
		newPatient.drainBlood();
		int afterDrain = newPatient.getBLOOD_LEVEL();
		assertEquals(beforeDrain - 5, afterDrain);
		
	}
}
