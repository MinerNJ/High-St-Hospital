package employees;
import java.util.Collection;

public class Nurse extends Employee {
	
	
	public Nurse(String Name, int i) {
		super(Name, i);
	}

	@Override
	public String calculatePay() {
		return "$50,000";
	}
	
}
