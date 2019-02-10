package employeeTests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import employees.Surgeon;

public class SurgeonTest {

	@Test
	public void shouldOperate() {
		
		Surgeon newEmployee = new Surgeon("Al", 123, "ENT", false);
		
		boolean actual = newEmployee.getOperating();
		
		assertEquals(true, actual);
	}
	
	@Test
	public void shouldCalculatePay() {
		
		Surgeon newEmployee = new Surgeon("Al", 123, null, false);
		
		String actual = newEmployee.calculatePay();
		
		assertEquals("$120,000", actual);
	}
}
