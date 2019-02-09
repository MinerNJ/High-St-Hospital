
public class Patient {

	private String Name;
	private String IDNum;
	private int DefaultBloodLevel = 20;
	private int DefaultHealthLevel = 10;
	private int CurrentBlood;
	private int CurrentHealth;

	public Patient(String Name, int IDNum){
		this.Name = Name;
		this.CurrentBlood = DefaultBloodLevel;
		this.CurrentHealth = DefaultHealthLevel;
	}
	
	public int getHEALTH_LEVEL() {
		return DefaultHealthLevel;
	}

	public int getBLOOD_LEVEL() {
		return DefaultBloodLevel;
	}

	public String getName() {
		return Name;
	}

	public String getIDNum() {
		return IDNum;
	}


	


}

