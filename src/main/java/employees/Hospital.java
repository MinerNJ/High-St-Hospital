package employees;
import java.util.Collection;
import java.util.HashMap;



public class Hospital {
	
		private HashMap<String, Employee> employees = new HashMap<String, Employee>();
		private HashMap<String, Patient> patients = new HashMap<String, Patient>();
		
		public Collection <Employee> getEmployees() {
			return employees.values();
		}

		public Collection <Patient> getPatients() {
			return patients.values();
		}

		public int getHospitalSize() {
			return (patients.size() + employees.size());
		}

		public void addPatient(Patient patient) {
			patients.put(patient.getIDNum(), patient);
		}

		public void addEmployee(Employee employee) {
			employees.put(employee.getIDNum(), employee);
		}

		
	}
	

