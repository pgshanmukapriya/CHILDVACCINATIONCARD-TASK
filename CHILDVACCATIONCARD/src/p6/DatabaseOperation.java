package p6;

import java.time.LocalDate;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

import p6.HibernateConnection;
import org.hibernate.Transaction;
import p6.Kid;

public class DatabaseOperation {
	public static void main(String[] args) {
		Session hibernate = HibernateConnection.getHibernateLink();

		Parent p=new Parent("moni","ji",789065489L);

		Vaccination v1=new Vaccination("c16", LocalDate.of(2023,3,16).toString(),"c9", LocalDate.of(2022,2,11).toString(),"good",200);
		Vaccination v2=new Vaccination("c14", LocalDate.of(2023,2,15).toString(),"c4", LocalDate.of(2022,3,9).toString(),"verygood",400);
		Vaccination v3=new Vaccination("c15", LocalDate.of(2023,1,8).toString(),"c5", LocalDate.of(2022,1,10).toString(),"good",800);
		List<Vaccination> AllVaccinationCertificates = Arrays.asList(v1,v2,v3);
		Hospital h= new Hospital(23, "Srija", "34567");
		Doctor d1=new Doctor("Rajesh", "Dermatology", 456798239L);
		Doctor d2=new Doctor("Suresh", "Psychiatry", 986754899L);
		Doctor d3=new Doctor("Raj", "Paediatrics", 678543234L);
		List<Doctor>allDoctors=Arrays.asList(d1,d2,d3);

		Kid k1=new Kid(LocalDate.of(2022, 7, 20).toString(),"Ramya","female",5);
		k1.setId(109);
		k1.setParentInfo(p);
		k1.setVaccinationCard(AllVaccinationCertificates);
        k1.setHospitalInfo(h);
        k1.setDoctorsInfo(allDoctors);
		insertKid(hibernate, k1);

	}
	public static void insertKid(Session hibernate, Kid k1) {

		Transaction t1 = hibernate.beginTransaction();

		hibernate.save(k1); // code to save Student in the database

		t1.commit();
		hibernate.close();

		System.out.println(" 5. Database commit & hibernate closed ...");
	}




	

}
