package p6;

import javax.persistence.Embeddable;

@Embeddable
public class Vaccination {
	private String doseName;
	private String vaccinationDate;
	private String nextDoseName;
	private String nextVaccinationDate;
	private String Remarks;
	private int Cost;
	
	public Vaccination() {
      super();
	}

	public Vaccination(String doseName, String vaccinationDate, String nextDoseName, String nextVaccinationDate,
			String remarks, int cost) {
		super();
		this.doseName = doseName;
		this.vaccinationDate = vaccinationDate;
		this.nextDoseName = nextDoseName;
		this.nextVaccinationDate = nextVaccinationDate;
		Remarks = remarks;
		Cost = cost;
	}

	public String getDoseName() {
		return doseName;
	}

	public void setDoseName(String doseName) {
		this.doseName = doseName;
	}

	public String getVaccinationDate() {
		return vaccinationDate;
	}

	public void setVaccinationDate(String vaccinationDate) {
		this.vaccinationDate = vaccinationDate;
	}

	public String getNextDoseName() {
		return nextDoseName;
	}

	public void setNextDoseName(String nextDoseName) {
		this.nextDoseName = nextDoseName;
	}

	public String getNextVaccinationDate() {
		return nextVaccinationDate;
	}

	public void setNextVaccinationDate(String nextVaccinationDate) {
		this.nextVaccinationDate = nextVaccinationDate;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int cost) {
		Cost = cost;
	}

	
}
