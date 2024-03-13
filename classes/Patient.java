package classes;

public class Patient {
	
	private String ID , name  , contact;

	public Patient(String iD, String name, String contact) {
		super();
		ID = iD;
		this.name = name;
		this.contact = contact;
	}

	public Patient() {
		
		ID = "";
		name = "";
		contact = "";
		
		
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

	@Override
	public String toString() {
		return "Patient [ID=" + ID + ", name=" + name + ", contact=" + contact + "]";
	}
	
	
	
	
	
	
	
	

}
