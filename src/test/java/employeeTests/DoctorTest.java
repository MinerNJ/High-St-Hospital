package employeeTests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import employees.Doctor;

public class DoctorTest {
	
	@Test
	public void shouldCheckSpecialty() {
		
		Doctor newDoctor = new Doctor("Al", 123, "ENT");
		
		String actual = newDoctor.getSpecialty();
		
		assertEquals("ENT", actual);
	}

	@Test
	public void shouldCalculatePay() {
		
		Doctor newEmployee = new Doctor("Al", 123, null);
		
		String actual = newEmployee.calculatePay();
		
		assertEquals("$90,000", actual);
	}
	
	@Test
	public void shouldHaveName() {
		Doctor newDoctor = new Doctor("Al", 0, null);
		
		String actual = newDoctor.getName();
		
		assertEquals("Al", actual);
	}
}
