package employees;

public abstract class Employee {
	
	private String Name;
	private String IDNum;
	
	public Employee(String Name, String IDNum) {
		this.Name = Name;
		this.IDNum = IDNum;
	}

	public String getName(){
		return Name;
	}
	
	public String getIDNum(){
		return IDNum;
	}
	
	public abstract String calculatePay();

	

	

	
}
