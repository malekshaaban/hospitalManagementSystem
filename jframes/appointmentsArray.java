package jframes;

import java.util.ArrayList;
import java.util.Iterator;

import mainclass.mainclass;


public class appointmentsArray {
	
ArrayList<appointment> appointmentList = new ArrayList<appointment>();
	
	appointment appointment = new appointment();
	
	
	/*public void addappointment(appointment ap) {
		
		
		appointmentList.add(ap);
		System.out.println("----------------------------------------------------");
		
		for (int i = 0; i < appointmentList.size(); i++) {
			System.out.println(appointmentList.get(i));
			
		}
		
		
		
	}
*/



	public appointmentsArray() {
		super();
	}
	
	
	public void search (String speciality) {
		
		for (int i = 0; i < appointmentList.size(); i++) {
			if(appointmentList.get(i).getSpeciality().equals(speciality)) {
				System.out.println(appointmentList.get(i).getName()+ " " + appointmentList.get(i).getSurname() );
				
				
				
			}
			
			
			
		}
		
		
		
	}
	
	public void addapointment (appointment appointment) {

		appointmentList.add(appointment);
		System.out.println("your appontment has been added");
		
		
		
	}
	
//	public appointment SearchappointmentByID(String ID) {
//		for (int i = 0; i < appointmentList.size(); i++) {
//			if(appointmentList.contains(ID))
//			{
//				
//				return appointmentList.get(i);
//				
//				
//			}
//			else
//				return null;
//		}
//		System.out.println("faild");
//		return null;
//		
//		
//	}
	
	
	
	public appointment SearchappointmentByID(String ID) {
		for (int i = 0; i <appointmentList.size() ; i++) {//appointmentList.size()
			if(appointmentList.get(i).getID().equals(ID))
			{
				
				return appointmentList.get(i);
				
				
			}
			
		}
		System.out.println("faild");
	return null;
	
		
		
	}
	
	public boolean SearchappointmentByIDBoolean(String ID) {
		for (int i = 0; i < appointmentList.size(); i++) {
			if(appointmentList.get(i).getID().equals(ID))//.getID().equals(ID)
			{
				
				return true;
				
				
			}
		}
	
		System.out.println("faild at appoinments array class");
		return false;
	}
	
	
//	public boolean SearchappointmentByIDBoolean(String ID) {
//		int i = 0;
//	while(i<appointmentList.size()) {
//		
//		
//		if(appointmentList.get(i).getID().equals(ID))
//			{
//				i++;
//				return true;
//				
//				
//			}
//			
//		}
//		System.out.println("faild at appoinments array class");
//		return false;
//		
//	}
//		
		
	
	public void deleteappointment (String appointmentID) {
		
		for (int i = 0; i < appointmentList.size(); i++) {
			if(appointmentList.get(i).getID().equals(appointmentID)) {
				appointmentList.remove(i);
				
			}
			
		}
		
		
	}
	
	public void printlist () {
		
		for (int i = 0; i < appointmentList.size(); i++) {
			
			System.out.println(appointmentList.get(i));
			System.out.println("");
		}
		
	}
public String printliststring () {
		
		for (int i = 0; i < appointmentList.size(); i++) {
			System.out.println(" ");
			return appointmentList.get(i).toString();
			
			
		}
		return"" ;
		
	}

public appointment get(int a) {
	
	return appointmentList.get(a);
	
	

}

public int getsize () {
	
	return appointmentList.size();
	
}


	

}
