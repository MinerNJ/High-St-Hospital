package employees;

public class VampireJanitor extends Janitor {
	
	boolean isDrinkingBlood;

	public VampireJanitor(String Name, int i, boolean isSweeping, boolean isDrinkingBlood) {
		super(Name, i, isSweeping);
		isDrinkingBlood = !isDrinkingBlood;
		}

	public boolean isThirsty() {
		return !isDrinkingBlood;
	}
	
	@Override
	public String calculatePay() {
		return "Unlimited access to the Blood Bank";
	}

}
