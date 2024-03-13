package classes;

public class HMS {

	public static void main(String[] args) {
		
		/*
		Patient p1 = new Patient("22","abcd","097");
		Patient p2 = new Patient("23","abcd","0976357");
		Patient p3 = new Patient("24","abcd","0976357");
		
		PatientList Plist = new PatientList();
		Plist.insert(p1);
		Plist.insert(p2);
		Plist.insert(p3);
		
		System.out.println(Plist.searchById("22").getName());
		System.out.println(Plist.searchByContact("097"));
		
		*/
		System.out.println("===========================================================================");
		
		Doctor d1 = new Doctor("123123", "malek", "09876", "eyes", 789," malek", "admin", 8);
		Doctor d2 = new Doctor("123123", "kjhkjh", "09876", "eyes", 789," malek", "admin", 8);
		Doctor d3 = new Doctor("123123", "dfg", "09876", "eyes", 789," malek", "admin", 8);
		Doctor d4 = new Doctor("123123", "poik", "09876", "eyes", 789," malek", "admin", 8);
		Doctor d5 = new Doctor("123123", "alkjh", "09876", "eyes", 789," malek", "admin", 8);
		Doctor d6 = new Doctor("123123", "uiui", "09876", "eyes", 789," malek", "admin", 8);
		
		doctorsTree dt = new doctorsTree();
		

		

		dt.insert(d1);
		dt.insert(d2);
		dt.insert(d3);
		dt.insert(d4);
		dt.insert(d5);
		dt.insert(d6);
		
		dt.inOrderWithoutRecursion();
		dt.delete(d4);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++=");
		dt.inOrderWithoutRecursion();
		
		
		

	}

}
