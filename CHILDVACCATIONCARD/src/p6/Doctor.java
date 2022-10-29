package p6;

import javax.persistence.Embeddable;

@Embeddable
public class Doctor {
	
	private String DocName;
	private String Specialization;
	private long  PhoneNumber;
	
	public Doctor() {
		super();
	}

	public Doctor(String docName, String specialization, long phoneNumber) {
		super();
		DocName = docName;
		Specialization = specialization;
		PhoneNumber = phoneNumber;
	}

	public String getDocName() {
		return DocName;
	}

	public void setDocName(String docName) {
		DocName = docName;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	public long getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	

}
