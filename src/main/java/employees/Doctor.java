package employees;

public class Doctor extends Employee {

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
		return "$90,000";
	}

}
