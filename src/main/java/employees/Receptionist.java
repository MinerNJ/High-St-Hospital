package employees;

public class Receptionist extends Employee {

	private boolean PhoneCall;
	
	public Receptionist(String Name, String IDNum, boolean PhoneCall) {
		super(Name, IDNum);
		PhoneCall = !PhoneCall;
		}

	public boolean getOnCall() {
		return !PhoneCall;
	}

	@Override
	public String calculatePay() {
		return "Salary: $45,000";
	}
	
	@Override
	public String toString() {
		return getName() + " " + getIDNum() + " ";
		
	}
}
