package employees;

public class Doctor extends Employee implements CareForPatient {

	private String Specialty;
	
	public Doctor(String Name, String string, String Specialty) {
		super(Name, string);
		this.Specialty = Specialty;
	}

	public String getSpecialty() {
		return Specialty;
	}
	
	@Override
	public String calculatePay() {
		return "Salary: $90,000";
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.recoverHealth();
	}

}
