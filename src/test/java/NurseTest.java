import static org.junit.Assert.assertEquals;

import org.junit.Test;

import employees.Nurse;

public class NurseTest {
	
	@Test
	public void shouldHaveName() {
		Nurse newEmployee = new Nurse("Al", 0);
		
		String actual = newEmployee.getName();
		
		assertEquals("Al", actual);
	}
	
	@Test
	public void shouldCalculatePay() {
		
		Nurse newEmployee = new Nurse("Al", 123);
		
		String actual = newEmployee.calculatePay();
		
		assertEquals("$50,000", actual);
	}
}
