package employeeTests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import employees.Nurse;
import employees.Patient;

public class NurseTest {
	
	Nurse testNurse = new Nurse("Al", null);
	Patient testPatient = new Patient(null, null);
	
	@Test
	public void shouldHaveName() {
		String actual = testNurse.getName();
		assertEquals("Al", actual);
	}
	
	@Test
	public void shouldCalculatePay() {
		String actual = testNurse.calculatePay();
		assertEquals("$50,000", actual);
	}
	
	@Test
	public void shouldAddPatient() {
		int beforePatient = testNurse.getRosterInfo();
		testNurse.addPatient(testPatient);
		int afterPatient = testNurse.getRosterInfo();
		assertEquals(beforePatient + 1, afterPatient);
	}
	
	@Test
	public void shouldDrawBlood() {
		testNurse.addPatient(testPatient);
		int beforeDraw = testPatient.getBLOOD_LEVEL();
		testPatient.reduceBlood();
		int afterDraw = testPatient.getBLOOD_LEVEL();
		assertEquals(beforeDraw - 2, afterDraw);
	}
	
	@Test
	public void shouldRestoreHealth() {
		testNurse.addPatient(testPatient);
		int beforeRestore = testPatient.getHEALTH_LEVEL();
		testPatient.restoreHealth();
		int afterRestore = testPatient.getHEALTH_LEVEL();
		assertEquals(beforeRestore + 1, afterRestore);
	}
}
