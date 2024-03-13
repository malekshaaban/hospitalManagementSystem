package classes;

public class Doctor {

	private int experience;
	private String ID , name  , contact,specialty;
	private int fees ;
	private String username;
	private String password;
	
	
	public Doctor(String iD, String name, String contact, String specialty, int fees,String username,String password,int experience) {
		super();
		ID = iD;
		this.name = name;
		this.contact = contact;
		this.specialty = specialty;
		this.fees = fees;
		this.username = username;
		this.password=password;
		this.experience= experience;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Doctor() {
		super();
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Doctor [ID=" + ID + ", name=" + name + ", contact=" + contact + ", specialty=" + specialty + ", fees="
				+ fees + "]";
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
