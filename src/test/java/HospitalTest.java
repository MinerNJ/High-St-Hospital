import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import employees.Employee;
import employees.Hospital;
import employees.Nurse;
import employees.Patient;

public class HospitalTest {

	Hospital testHospital = new Hospital();
	Patient testPatient = new Patient(null, null);
	Patient testPatient2 = new Patient(null, null);
	Employee testEmployee = new Nurse(null, null);
	Nurse testNurse = new Nurse(null, null);

	@Test
	public void shouldBeAbleToAddPatient() {
		int initialPatients = testHospital.getHospitalSize();
		testHospital.addPatient(testPatient); 
		int afterPatients = testHospital.getHospitalSize();
		assertEquals(initialPatients + 1, afterPatients);
	}
	
	@Test
	public void shouldBeAbleToAddEmployee() {
		int initialEmployees = testHospital.getHospitalSize();
		testHospital.addEmployee(testEmployee); 
		int afterEmployees = testHospital.getHospitalSize();
		assertEquals(initialEmployees + 1, afterEmployees);
	}
	
	@Test
	public void shouldNurseCareAllPatients() {
		testHospital.addPatient(testPatient);
		testHospital.addPatient(testPatient2);
		int beforeCare1 = testPatient.getHEALTH_LEVEL();
		int beforeCare2 = testPatient2.getHEALTH_LEVEL();
		testHospital.nurseCareForAllPatients();
		assertEquals(beforeCare1 + beforeCare2 + 2, 22);

	}
	
	@Test
	public void shouldDoctorCareAllPatients() {
		testHospital.addPatient(testPatient);
		testHospital.addPatient(testPatient2);
		int beforeCare1 = testPatient.getHEALTH_LEVEL();
		int beforeCare2 = testPatient2.getHEALTH_LEVEL();
		testHospital.doctorCareForAllPatients();
		assertEquals(beforeCare1 + beforeCare2 + 4, 24);

	}
	
	@Test
	public void shouldDoctorCareForPatient() {
		testHospital.addPatient(testPatient);
		int beforeCare = testPatient.getHEALTH_LEVEL();
		testHospital.doctorCareForPatient(testPatient);
		int afterCare = testPatient.getHEALTH_LEVEL();
		assertEquals(beforeCare + 2, afterCare);

	}
	
	@Test
	public void shouldCleanHospital() {
		testHospital.dirtyHospital(10);
		int beforeCleaning = testHospital.getCleanliness();
		testHospital.cleanHospital();
		int afterCleaning = testHospital.getCleanliness();
		assertEquals(beforeCleaning + 10, afterCleaning);
	}
}
