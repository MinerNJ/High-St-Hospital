package employees;

public class VampireJanitor extends Janitor implements BloodWork{
	
	boolean isDrinkingBlood;

	public VampireJanitor(String Name, String IDNum, boolean isSweeping, boolean isDrinkingBlood) {
		super(Name, IDNum, isSweeping);
		isDrinkingBlood = !isDrinkingBlood;
		}

	public boolean isThirsty() {
		return !isDrinkingBlood;
	}
	
	@Override
	public String calculatePay() {
		return "Salary: Unlimited access to the Blood Bank";
	}

	@Override
	public void drawBlood(Patient patient) {
		if(isDrinkingBlood = true) {
			patient.drainBlood();
		}
	}

}
