package cgm.src.main.java.dto;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;

import cgm.src.main.java.entities.Patient;
import cgm.src.main.java.entities.Visit;

public class VisitDTO {

	Long id;
    DateTime Date;
	DateTime Time;
	String TypeOfVisit;
	String FamilyHistory;
	String ReasonOfVisit; 
	Patient patient;
	Visit visit;
	
	public VisitDTO() {
		super();
	}
	
	public VisitDTO(Visit visit) {
		super();
		this.visit = visit;
	}

	public VisitDTO(Patient patient, Visit visit) {
		super();
		this.visit = visit;
		this.patient = patient;
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

	public DateTime getDate() {
		return Date;
	}

	public void setDate(DateTime date) {
		Date = date;
	}

	public DateTime getTime() {
		return Time;
	}

	public void setTime(DateTime time) {
		Time = time;
	}

	public String getTypeOfVisit() {
		return TypeOfVisit;
	}

	public void setTypeOfVisit(String typeOfVisit) {
		TypeOfVisit = typeOfVisit;
	}

	public String getFamilyHistory() {
		return FamilyHistory;
	}

	public void setFamilyHistory(String familyHistory) {
		FamilyHistory = familyHistory;
	}

	public String getReasonOfVisit() {
		return ReasonOfVisit;
	}

	public void setReasonOfVisit(String reasonOfVisit) {
		ReasonOfVisit = reasonOfVisit;
	}

	@Override
	public String toString() {
		return "VisitDTO [id=" + id + ", Date=" + Date + ", Time=" + Time + ", TypeOfVisit=" + TypeOfVisit
				+ ", FamilyHistory=" + FamilyHistory + ", ReasonOfVisit=" + ReasonOfVisit + ", patient=" + patient
				+ ", visit=" + visit + "]";
	}

	
	
	

}
