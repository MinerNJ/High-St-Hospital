package employeeTests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import employees.Receptionist;
import junit.framework.Assert;

public class ReceptionistTest {

	@Test
	public void shouldCallPhone() {
		Receptionist newEmployee = new Receptionist(null, 0, false);
		
		boolean actual = newEmployee.getOnCall();
		
		assertEquals(true, actual);
	}
	
	@Test
	public void shouldCalculatePay() {
		
		Receptionist newEmployee = new Receptionist(null, 123, false);
		
		String actual = newEmployee.calculatePay();
		
		assertEquals("$45,000", actual);
	}
}
