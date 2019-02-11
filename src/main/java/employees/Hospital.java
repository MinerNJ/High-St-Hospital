package employees;
import java.util.Collection;
import java.util.HashMap;




public class Hospital implements CareForPatient{
	
		private HashMap<String, Employee> employees = new HashMap<String, Employee>();
		private HashMap<String, Patient> patients = new HashMap<String, Patient>();
		private int cleanliness = 100;
		
		public HashMap<String, Employee> getEmployees() {
			return employees;
		}

		public HashMap<String, Patient> getPatients() {
			return patients;
		}

		public int getHospitalSize() {
			return (patients.size() + employees.size());
		}
		
		public int getCleanliness() {
			return cleanliness;
		}

		public void addPatient(Patient patient) {
			patients.put(patient.getIDNum(), patient);
		}

		public void addEmployee(Employee employee) {
			employees.put(employee.getIDNum(), employee);
		}

		public void nurseCareForAllPatients() {
			Collection<Patient> patients = getPatients().values();
			for (Patient patient : patients) {
				patient.restoreHealth();
			}
		}
		
		public void doctorCareForAllPatients() {
			Collection<Patient> patients = getPatients().values();
			for (Patient patient : patients) {
				patient.recoverHealth();
			}
		}
	
		public void doctorCareForPatient(Patient patient) {
				patient.recoverHealth();
		}
		
		public void cleanHospital() {
			cleanliness += 10;
		}

		public void dirtyHospital(int turnCount) {
			if (turnCount % 5 == 0)
				cleanliness -= 5;
		}

		@Override
		public void careForPatient(Patient patient) {
			patient.restoreHealth();
		}

		@Override
		public void BloodSample(Patient patient) {
			patient.drawBlood();
		}
	}
	

