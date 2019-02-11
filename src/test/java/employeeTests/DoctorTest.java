package employeeTests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import employees.Doctor;
import employees.Patient;

public class DoctorTest {
	
	Doctor newDoctor = new Doctor("Al", null, "ENT");
	Patient newPatient = new Patient(null, null);

	@Test
	public void shouldCheckSpecialty() {
		String actual = newDoctor.getSpecialty();
		assertEquals("ENT", actual);
	}

	@Test
	public void shouldCalculatePay() {
		String actual = newDoctor.calculatePay();
		assertEquals("$90,000", actual);
	}
	
	@Test
	public void shouldHaveName() {
		String actual = newDoctor.getName();
		assertEquals("Al", actual);
	}
	
	@Test
	public void shouldRecoverHealth() {
		int beforeRecover = newPatient.getHEALTH_LEVEL();
		newPatient.recoverHealth();
		int afterRecover = newPatient.getHEALTH_LEVEL();
		assertEquals(beforeRecover + 2, afterRecover);
	}
}
