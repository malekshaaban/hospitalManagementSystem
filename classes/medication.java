package classes;

public class medication {

	
	private String name ;
	private String quantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public medication(String name, String quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	public medication() {
		super();
	}
	@Override
	public String toString() {
		return "medication [name=" + name + ", quantity=" + quantity + "]";
	}
	
	
	
	
	
	
	
	
	
}
