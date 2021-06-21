package cgm.src.main.java.entities;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

@Entity
@Table(name = "visits")
public class Visit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private DateTime Date;
	private DateTime Time;
	private String TypeOfVisit;
	private String FamilyHistory;
	private String ReasonOfVisit;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id")
	private Patient patient;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Visit [Id=" + Id + ", Date=" + Date + ", Time=" + Time + ", TypeOfVisit=" + TypeOfVisit
				+ ", FamilyHistory=" + FamilyHistory + ", ReasonOfVisit=" + ReasonOfVisit + ", patient=" + patient
				+ "]";
	}
	
	

	


}
