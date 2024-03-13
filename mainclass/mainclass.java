package mainclass;
import classes.*;

import java.util.ArrayList;
import java.util.Random;

import classes.Doctor;
import classes.doctorsTree;
import jframes.Login;
import jframes.appointment;
import jframes.appointmentsArray;
import jframes.doctorsframe;
import jframes.helloWindow;
import jframes.newAppointment;
import jframes.patientLogin;
import jframes.patientsFrame;

public class mainclass {
	
	public static  doctorsTree dt = new doctorsTree();
public static appointmentsArray appointmentList = new appointmentsArray();
public static ArrayList<medication> Medicationlist = new ArrayList<>();


 
	
	public static String patientID;

	public static void main(String[] args) {
		
		
		
		helloWindow hw = new helloWindow();
		hw.setVisible(true);
//		Login lg = new Login();
//		doctorsframe df = new doctorsframe();
//		newAppointment newappointmemt = new newAppointment();
//		patientLogin pl = new patientLogin();
//		patientsFrame pf = new patientsFrame();
		 medication m1 = new medication("Paracetamol","55");
		 medication m2 = new medication("Aspirin","255");
		 medication m3 = new medication("Ibuprofen","363");

		Medicationlist.add(m1);
		Medicationlist.add(m2);
		Medicationlist.add(m3);

		
		
		
		
		Doctor d1 = new Doctor("123123", "malek", "09876", "eyes", 789,"malek", "admin", 8);
		Doctor d2 = new Doctor("123123", "nourhan", "09876", "eyes", 789,"nourhan", "admin", 8);
		Doctor d3 = new Doctor("123123", "omer", "09876", "eyes", 789,"omer", "admin", 8);
		Doctor d4 = new Doctor("123123", "merve", "09876", "eyes", 789,"merve", "admin", 8);
		Doctor d5 = new Doctor("123123", "ozge", "09876", "eyes", 789,"ozge", "admin", 8);
		Doctor d6 = new Doctor("123123", "uiui", "09876", "eyes", 789," malek", "admin", 8);
		
		dt.insert(d1);
		dt.insert(d2);
		dt.insert(d3);
		dt.insert(d4);
		dt.insert(d5);
		dt.insert(d6);
//		System.out.println("done");
//		Random rn = new Random();
//		String ID = Integer.toString(rn.nextInt(999999999));
		
//		dt.inOrderWithoutRecursion();
		
		
//		  appointment appo = new appointment("malek", ID, ID, ID, ID, ID, "1234");
//		   ID = Integer.toString(rn.nextInt(999999999));
//		
//		 appointment appo1 = new appointment("mal", ID,"jj", ID, ID, ID, "456");
//		  ID = Integer.toString(rn.nextInt(999999999));
//		 
//	 appointment appo2 = new appointment("m", ID, ID, ID, ID, ID, "789");
//		
//		appointmentList.addapointment(appo);
//		appointmentList.addapointment(appo1);
//		
//		appointmentList.addapointment(appo2);
//		appointmentList.printlist();
//		
//		System.out.println(appointmentList.get(0));
		
		
		
		
		
		
		
//		boolean a= appointmentList.SearchappointmentByIDBoolean("456");
//		 appointmentList.search("456");
//
//		
//		System.out.println(a);
		

	}

}
