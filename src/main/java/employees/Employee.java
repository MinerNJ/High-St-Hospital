package employees;

public abstract class Employee {
	
	private String Name;
	private String IDNum;
	
	public Employee(String Name, int i) {
		this.Name = Name;
		this.IDNum = Name;
	}

	public String getName(){
		return Name;
	}
	
	public String getIDNum(){
		return IDNum;
	}
	
	public abstract String calculatePay();

	

	

	
}
