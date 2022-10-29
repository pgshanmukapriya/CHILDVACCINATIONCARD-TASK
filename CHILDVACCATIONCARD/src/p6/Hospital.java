package p6;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	private int patientId;
	private String Name;
	private String RegistrationNumber;
	

	@Embedded
	private Doctor DoctorsInfo ;
	
	@OneToMany(cascade = CascadeType.ALL)		
	@JoinColumn(name="DoctorsInfo")
	List<Doctor>allDoctors;
	
	public Hospital() {
		super();
	}

	public Hospital(int patientId, String name, String registrationNumber) {
		super();
		this.patientId = patientId;
		Name = name;
		RegistrationNumber = registrationNumber;
	}



	public List<Doctor> getAllDoctors() {
		return allDoctors;
	}

	public void setAllDoctors(List<Doctor> allDoctors) {
		this.allDoctors = allDoctors;
	}

	public Doctor getDoctorsInfo() {
		return DoctorsInfo;
	}

	public void setDoctorsInfo(Doctor doctorsInfo) {
		DoctorsInfo = doctorsInfo;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRegistrationNumber() {
		return RegistrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		RegistrationNumber = registrationNumber;
	}

	@Override
	public String toString() {
		return "Hospital [patientId=" + patientId + ", Name=" + Name + ", RegistrationNumber=" + RegistrationNumber
				+ ", DoctorsInfo=" + DoctorsInfo + "]";
	}

	public void setDoctorsInfo(List<Doctor> allDoctors2) {
		// TODO Auto-generated method stub
		
	}


}
