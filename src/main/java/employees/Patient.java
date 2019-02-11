package employees;

public class Patient implements BloodWork {

	private String Name;
	private String IDNum;
	private int BloodLevel;
	private int HealthLevel;
	

	public Patient(String Name, String IDNum){
		this.Name = Name;
		this.IDNum = IDNum;
		this.BloodLevel = BLOOD_LEVEL;
		this.HealthLevel = HEALTH_LEVEL;
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

	public void restoreHealth() {
		HealthLevel +=1; 
	}

	public void recoverHealth() {
		HealthLevel +=2;
	}

	public void drawBlood() {
		BloodLevel -=2;
	}

	public void worsenWithTick(int counter) {
		if(counter %5 == 0) {
			BloodLevel -=1;
		}
	}
	
}

	

	

	



	




