package employees;

public class Janitor extends Employee {

	private boolean isSweeping;
	
	public Janitor(String Name, int i, boolean isSweeping) {
		super(Name, i);
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
