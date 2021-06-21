package cgm.src.main.java.dto;

import cgm.src.main.java.entities.Patient;
import cgm.src.main.java.entities.Visit;

public class PatientDTO {
	
	Long id;
	Patient patient;
	Visit visit;
	String FirstName;
	String LastName;
	String DateOfBirth;
	String SocialSecurityNumber;
	
	public PatientDTO() {
		super();
	}
	
	public PatientDTO(Patient patient) {
		super();
		this.patient = patient;
	}

	public PatientDTO(Patient patient, Visit visit) {
		super();
		this.patient = patient;
		this.visit = visit;		
	}
	
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Visit getVisit() {
		return visit;
	}
	public void setVisit(Visit visit) {
		this.visit = visit;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getSocialSecurityNumber() {
		return SocialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		SocialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "PatientDTO [id=" + id + ", patient=" + patient + ", visit=" + visit + ", FirstName=" + FirstName
				+ ", LastName=" + LastName + ", DateOfBirth=" + DateOfBirth + ", SocialSecurityNumber="
				+ SocialSecurityNumber + "]";
	}



}
