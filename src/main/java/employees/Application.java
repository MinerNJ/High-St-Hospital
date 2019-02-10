package employees;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Hospital hospital = new Hospital();
		int counter = 0;

		System.out.println("Welcome to High St. Hospital!");
		
		Patient patient1 = new Patient("Carl", "001");
		hospital.addPatient(patient1);
		Patient patient2 = new Patient("Rosa", "002");
		hospital.addPatient(patient2);
		Patient patient3 = new Patient("Greg", "003");
		hospital.addPatient(patient3);
		Patient patient4 = new Patient("Alice", "004");
		hospital.addPatient(patient4);
		Patient patient5 = new Patient("Dwayne", "005");
		hospital.addPatient(patient5);
		Patient patient6 = new Patient("Brittany", "006");
		hospital.addPatient(patient6);

		System.out.println("The following patients are currently seeking treatment: ");
		System.out.println(hospital.getPatients());
		
		Employee employee1 = new Nurse("Amy", "999");
		hospital.addEmployee(employee1);
		Employee employee2 = new Doctor("Charles", "998", "ENT");
		hospital.addEmployee(employee2);
		Employee employee3 = new Surgeon("Marge", "997", "Neurosurgery", false);
		hospital.addEmployee(employee3);
		Employee employee4 = new Receptionist("Carlos", "996", false);
		hospital.addEmployee(employee4);
		Employee employee5 = new Janitor("Samantha", "995", false);
		hospital.addEmployee(employee5);
		Employee employee6 = new VampireJanitor("Vlad", "994", false, false);
		hospital.addEmployee(employee6);
		
		
		
		System.out.println("The following staff are currently on call:");
		hospital.getEmployees();
	}
}