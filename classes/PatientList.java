package classes;

public class PatientList {
	
	Pnode first ,last ;

	public PatientList() {
		first = null;
		last = null;
	}
	
	public void insert (Patient patient) {
		Pnode node = new Pnode(patient);
		
		if(first==null || last == null ) {
			
			first=node;
			last=node;
			
			
		}
		else {
			first.setNext(node);
			node.setPrev(first);
			first = node;
			
		}
		
	}

	
	
	public Patient searchById(String id) {
		
		Pnode temp = first;
		while (temp!=null) {
			if(temp.getPatient().getID().equals(id)) {
				return temp.getPatient();
				
			}
			temp=temp.getPrev();
			
			
			
		}
		return null;
		
	}
	
public Patient searchByContact(String contact) {
		
		Pnode temp = first;
		while (temp!=null) {
			if(temp.getPatient().getContact().equals(contact)) {
				return temp.getPatient();
				
			}
			temp=temp.getPrev();
			
			
			
		}
		return null;
		
	}
	
	

}
