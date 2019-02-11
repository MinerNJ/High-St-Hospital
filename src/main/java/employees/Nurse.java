package employees;

import java.util.ArrayList;
import java.util.Collection;

public class Nurse extends Employee implements CareForPatient{
	
	private ArrayList <Object> patientRoster = new ArrayList <Object>();


	public Nurse(String Name, String IDNum) {
		super(Name, IDNum);
	}
	
	public int getRosterInfo() {
		return patientRoster.size();
	}

	public void addPatient(Object patient) {
		patientRoster.add(patient);
	}
	
	@Override
	public String calculatePay() {
		return "Salary: $50,000";
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.restoreHealth();
	}

	@Override
	public void BloodSample(Patient patient) {
		 patient.drawBlood();
	}

	@Override
	public String toString() {
		return getName() + " " + getIDNum() + " ";
		
	}

}
