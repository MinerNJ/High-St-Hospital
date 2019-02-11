package employees;

public class Patient {

	private String Name;
	private String IDNum;
	private int BloodLevel;
	private int HealthLevel;
	

	public Patient(String Name, String IDNum){
		this.Name = Name;
		this.IDNum = IDNum;
		this.BloodLevel = 20;
		this.HealthLevel = 10;
	}
	
	public int getHEALTH_LEVEL() {
		return HealthLevel;
	}

	public int getBLOOD_LEVEL() {
		return BloodLevel;
	}

	public String getName() {
		return Name;
	}

	public String getIDNum() {
		return IDNum;
	}

	public int getCurrentBlood() {
		return BloodLevel;
	}
	
	public void reduceBlood() {
		BloodLevel -=2;
	}

	public void drainBlood() {
		BloodLevel -=5;
	}

	public void restoreHealth() {
		HealthLevel +=1; 
	}

	public void recoverHealth() {
		HealthLevel +=2;
	}



	


}

