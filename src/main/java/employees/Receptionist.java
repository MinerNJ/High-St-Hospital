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
		return "$45,000";
	}
}
