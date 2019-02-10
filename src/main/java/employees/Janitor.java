package employees;

public class Janitor extends Employee {

	private boolean isSweeping;
	
	public Janitor(String Name, String IDNum, boolean isSweeping) {
		super(Name, IDNum);
		isSweeping = !isSweeping;
	}

	public boolean getSweeping() {
		return !isSweeping;
	}

	@Override
	public String calculatePay() {
		return "$40,000";
	}

}
