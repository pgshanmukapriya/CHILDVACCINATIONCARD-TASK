package p6;

import javax.persistence.Embeddable;

@Embeddable
public class Parent {
	private String FatherName;
	private String MotherName;
	private long PhoneNumber;
	
	public Parent() {
		super();
	}

	public Parent(String fatherName, String motherName, long phoneNumber) {
		super();
		FatherName = fatherName;
		MotherName = motherName;
		PhoneNumber = phoneNumber;
	}

	public String getFatherName() {
		return FatherName;
	}

	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}

	public String getMotherName() {
		return MotherName;
	}

	public void setMotherName(String motherName) {
		MotherName = motherName;
	}

	public long getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Parent [FatherName=" + FatherName + ", MotherName=" + MotherName + ", PhoneNumber=" + PhoneNumber + "]";
	}

}
