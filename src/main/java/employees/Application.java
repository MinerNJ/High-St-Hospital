package employees;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Hospital hospital = new Hospital();
		int cleanliness = 100;
		int counter = 0;

		System.out.println("Welcome to High St. Hospital!");

		Patient patient1 = new Patient("Carl", "ID Num: 001");
		hospital.addPatient(patient1);
		Patient patient2 = new Patient("Rosa", "ID Num: 002");
		hospital.addPatient(patient2);
		Patient patient3 = new Patient("Greg", "ID Num: 003");
		hospital.addPatient(patient3);
		Patient patient4 = new Patient("Alice", "ID Num: 004");
		hospital.addPatient(patient4);
		Patient patient5 = new Patient("Dwayne", "ID Num: 005");
		hospital.addPatient(patient5);
		Patient patient6 = new Patient("Brittany", "ID Num: 006");
		hospital.addPatient(patient6);

		Employee employee1 = new Nurse("Amy", "ID Num: 999");
		hospital.addEmployee(employee1);
		Employee employee2 = new Doctor("Charles", "ID Num: 998", "ENT");
		hospital.addEmployee(employee2);
		Employee employee3 = new Surgeon("Marge", "ID Num: 997", "Neurosurgery", false);
		hospital.addEmployee(employee3);
		Employee employee4 = new Receptionist("Carlos", "ID Num: 996", false);
		hospital.addEmployee(employee4);
		Employee employee5 = new Janitor("Samantha", "ID Num: 995", false);
		hospital.addEmployee(employee5);
		Employee employee6 = new VampireJanitor("Vlad", "ID Num: 994", false, false);
		hospital.addEmployee(employee6);

		boolean loopMainMenu = true;

		while (loopMainMenu) {
			
			counter += 1;
			hospital.dirtyHospital(counter);
			for(Patient patient : hospital.getPatients().values()) {
				patient.worsenWithTick(counter);
			}
			
			System.out.println("What would you like to do?");
			System.out.println("1. Check current employees.");
			System.out.println("2. Check current patients.");
			System.out.println("3. Provide care for all patients.");
			System.out.println("4. Provide care for a single patient.");
			System.out.println("5. Clean the hospital.");
			System.out.println("6. Exit ");
			System.out.println("7. Help ");

			String MainMenuSelection = input.nextLine();

			switch (MainMenuSelection) {

			case "1":
				System.out.println("The following staff are currently on call:");
				System.out.println(hospital.getEmployees().values());
				break;

			case "2":
				System.out.println("The following patients are currently seeking treatment:");
				System.out.println(hospital.getPatients().values().toString());
				break;

			case "3":
				boolean CareChoice = true;
				while (CareChoice) {

					System.out.println("Please select whom you'd like to care for the patients:");
					System.out.println("1. A Nurse");
					System.out.println("2. A Doctor");
					System.out.println("3. A Surgeon");
					System.out.println("4. " + employee6.getName());
					System.out.println("5. Return to Main Menu");

					String CareSelection = input.nextLine();
					switch (CareSelection) {

					case "1":
						System.out.println("The hospital nurse, " + employee1.getName() + ", " + " cared for your patients!");
						hospital.nurseCareForAllPatients();
						break;

					case "2":
						System.out.println("The hospital doctor, " + employee2.getName() + ", " + " cared for your patients!");
						hospital.doctorCareForAllPatients();
						break;

					case "3":
						System.out.println("Surgeons don't provide general care.");
						break;

					case "4":
						System.out.println("Coming soon!");
						break;
						
					case "5":
						CareChoice = false;
						break;
					}
				}
				
			case "4":
				boolean SingleCareChoice = true;
				while (SingleCareChoice) {
					
					counter += 1;
					hospital.dirtyHospital(counter);
					for(Patient patient : hospital.getPatients().values()) {
						patient.worsenWithTick(counter);
					}
					
					System.out.println("Please select the patient you would like to treat:");
					System.out.println("1." + patient1.getName()); 
					System.out.println("2." + patient2.getName());
					System.out.println("3." + patient3.getName());
					System.out.println("4." + patient4.getName());
					System.out.println("5." + patient5.getName());
					System.out.println("6." + patient6.getName());
					System.out.println("7. Return to Main Menu.");
					
					String SingleCareSelection = input.nextLine();
					switch(SingleCareSelection) {
					
					case "1":
						System.out.println("Doctor or Nurse care?");
						String ProfessionalSelection = input.nextLine();
						if(ProfessionalSelection != "doctor") {
							patient1.restoreHealth();
						} else {
							patient1.recoverHealth();
						}
						System.out.println("Patient treated!");
						break;
						
					case "2":
						System.out.println("Doctor or Nurse care?");
						String ProfessionalSelection2 = input.nextLine();
						if(ProfessionalSelection2 != "doctor") {
							patient1.restoreHealth();
						} else {
							patient1.recoverHealth();
						}
						System.out.println("Patient treated!");
						break;
						
					case "3":
						System.out.println("Doctor or Nurse care?");
						String ProfessionalSelection3 = input.nextLine();
						if(ProfessionalSelection3 != "doctor") {
							patient1.restoreHealth();
						} else {
							patient1.recoverHealth();
						}
						System.out.println("Patient treated!");
						break;
						
					case "4":
						System.out.println("Doctor or Nurse care?");
						String ProfessionalSelection4 = input.nextLine();
						if(ProfessionalSelection4 != "doctor") {
							patient1.restoreHealth();
						} else {
							patient1.recoverHealth();
						}
						System.out.println("Patient treated!");
						break;
						
					case "5":
						System.out.println("Doctor or Nurse care?");
						String ProfessionalSelection5 = input.nextLine();
						if(ProfessionalSelection5 != "doctor") {
							patient1.restoreHealth();
						} else {
							patient1.recoverHealth();
						}
						System.out.println("Patient treated!");
						break;
						
					case "6":
						System.out.println("Doctor or Nurse care?");
						String ProfessionalSelection6 = input.nextLine();
						if(ProfessionalSelection6 != "doctor") {
							patient1.restoreHealth();
						} else {
							patient1.recoverHealth();
						}
						System.out.println("Patient treated!");
						break;
						
					case "7":
						SingleCareChoice = false;
					}
				}
			case "5":
				hospital.cleanHospital();
				break;
				
			case "6":
				System.out.println("Thanks for playing!");
				loopMainMenu = false;
				break;
				
			case "7":
				System.out.println("Its like an easier version of VirtualPet, \nI think you'll figure it out.");
				break;
			}
		}
	}
}
