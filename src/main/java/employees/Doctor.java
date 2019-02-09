package employees;

public class Doctor extends Employee {

	private String Specialty;
	
	public Doctor(String Name, int i, String Specialty) {
		super(Name, i);
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
