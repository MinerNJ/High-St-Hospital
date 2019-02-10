package employeeTests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import employees.VampireJanitor;

public class VampireJanitorTest {

	@Test
	public void shouldGetThirst() {
		VampireJanitor newEmployee = new VampireJanitor(null, 0, false, false);
		
		boolean actual = newEmployee.isThirsty();
		
		assertEquals(true, actual);
	}
	
	@Test
	public void shouldCalculatePay() {
		VampireJanitor newEmployee = new VampireJanitor (null, 0, false, false);
		
		String actual = newEmployee.calculatePay();
		
		assertEquals("Unlimited access to the Blood Bank", actual);
	}
}
