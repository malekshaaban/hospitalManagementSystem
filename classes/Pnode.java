package classes;

public class Pnode {
	
	private Patient patient;
	
	private Pnode prev;
	private Pnode next;
	public Pnode()
	{
	prev = null;
	next = null;
	patient = null;
	}
	

	
	public Pnode(Patient  newPatient)
	{
		setpatient( newPatient);
	prev = null;
	next = null;
	}
	public Pnode(Patient newPatient, Pnode nextValue)
	{
		setpatient( newPatient);
	prev = null;
	next = nextValue;
	}
	
	public Pnode(Patient newPatient, Pnode prevValue, Pnode 
			nextValue)
			{
		setpatient(newPatient);
			prev = prevValue;
			next = nextValue;
			}
	
	public void setpatient(Patient newPatient) {
		patient = newPatient;
		}
		public void setPrev(Pnode newPrev) {
		prev = newPrev;
		}
		public void setNext(Pnode newNext) {
		next = newNext;
		}
	public Pnode getPrev() {
			return prev;
		}



		public Pnode getNext() {
			return next;
		}



	public Patient getPatient() {
		return patient;
	}
}
