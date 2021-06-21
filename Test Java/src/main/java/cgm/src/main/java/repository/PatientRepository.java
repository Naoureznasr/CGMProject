package cgm.src.main.java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cgm.src.main.java.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	
	@Query(value="select * from patient where Id =: IdP", nativeQuery = true)
	public List<Patient> findById(@Param("IdP") Long IdP);

}