package jframes;

public class appointment {
private String name,surname,speciality,day,month,year,ID,date;

	

	//public appointment() {
	//	super();
	//}




public boolean containsID(String ID) {
	if(this.ID.equals(ID)) {
		return true;
	}
	else
		return false;
	
}

	public String getID() {
	return ID;
}

public void setID(String iD) {
	ID = iD;
}

	public appointment(String name, String surname, String speciality, String day, String month, String year,String ID) {
		super();
		this.name = name;
		this.surname = surname;
		this.speciality = speciality;
		this.day = day;
		this.month = month;
		this.year = year;
		this.ID=ID;
		
		
		date=day + " , "+ month +" , "+ year;
		
		
		
		
		
		
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public appointment() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	
	@Override
	public String toString() {
		return "appointment [name=" + name + ", surname=" + surname + ", speciality=" + speciality + ", day=" + day
				+ ", month=" + month + ", year=" + year + "ID = "+ ID +"]";
	}
	
	

}
