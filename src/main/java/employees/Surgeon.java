package employees;

public class Surgeon extends Doctor {

	private boolean Operation;
	
	public Surgeon(String Name, String IDNum, String Specialty, boolean Operating) {
		super(Name, IDNum, Specialty);
		Operating = !Operating;
		
	}

	public boolean getOperating() {
		return !Operation;
	}
	
	@Override
	public String calculatePay() {
		return "$120,000";
	}

}
