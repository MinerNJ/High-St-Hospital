import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import employees.Employee;

public class HospitalTest {

	@Test
	public void shouldBeAbleToAddPatient() {
		// Arrange
		Hospital testHospital = new Hospital();
		Patient testPatient = new Patient(null, 0);

		// Act

		int initialPatients = testHospital.getHospitalSize();
		testHospital.addPatient(testPatient); 
		int afterPatients = testHospital.getHospitalSize();

		// Assert
		assertEquals(initialPatients + 1, afterPatients);
	}
	
	@Test
	public void shouldBeAbleToAddEmployee() {
		// Arrange
		Hospital testHospital = new Hospital();
		Employee testEmployee = new Employee(null, 1);

		// Act

		int initialEmployees = testHospital.getHospitalSize();
		testHospital.addEmployee(testEmployee); 
		int afterEmployees = testHospital.getHospitalSize();

		// Assert
		assertEquals(initialEmployees + 1, afterEmployees);
	}
}
