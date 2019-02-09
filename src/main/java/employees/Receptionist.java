package employees;

public class Receptionist extends Employee {

	private boolean PhoneCall;
	
	public Receptionist(String Name, int i, boolean PhoneCall) {
		super(Name, i);
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
