import java.util.HashMap;

import employees.Employee;


public class Hospital {
	
		private HashMap<String, Employee> employees = new HashMap<String, Employee>();
		private HashMap<String, Patient> patients = new HashMap<String, Patient>();
		
		public HashMap<String, Employee> getEmployees() {
			return employees;
		}

		public HashMap<String, Patient> getPatients() {
			return patients;
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
	

