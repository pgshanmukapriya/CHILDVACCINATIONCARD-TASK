package p6;

import java.util.List;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
public class Kid {
	@Id
	private int id;
   @Column(name="Kid_Name")
   private String Dob;
	private String Name;
	private String Gender;
	private int weight;
	
	@Embedded
	private Parent parentInfo ;
	@Embedded
	@AttributeOverrides({
	      @AttributeOverride(name = "fatherName", column = @Column(name = "grandFather")),
	      @AttributeOverride(name = "motherName", column = @Column(name = "grandMother")),
	      @AttributeOverride(name = "phoneNumber", column = @Column(name = "gPhoneNumber")),

	})

	@ElementCollection
	@CollectionTable(name = "VaccinationCertificates")
	private List<Vaccination> vaccinationCard;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "HospitalInfo")
	private Hospital HospitalInfo;
	
	public Kid() {
		super();
		
	}


	public Kid(String dob, String name, String gender, int weight) {
		super();
		Dob = dob;
		Name = name;
		Gender = gender;
		this.weight = weight;
	}


	public Hospital getHospitalInfo() {
		return HospitalInfo;
	}


	public void setHospitalInfo(Hospital hospitalInfo) {
		HospitalInfo = hospitalInfo;
	}


	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Parent getParentInfo() {
		return parentInfo;
	}

	public void setParentInfo(Parent parentInfo) {
		this.parentInfo = parentInfo;
	}


	public List<Vaccination> getVaccinationCard() {
		return vaccinationCard;
	}

	public void setVaccinationCard(List<Vaccination> vaccinationCard) {
		this.vaccinationCard = vaccinationCard;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Kid [id=" + id + ", Dob=" + Dob + ", Name=" + Name + ", Gender=" + Gender + ", weight=" + weight
				+ ", parentInfo=" + parentInfo + ", vaccinationCard=" + vaccinationCard + "]";
	}


}
