package cgm.src.main.java.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cgm.src.main.java.dto.PatientDTO;
import cgm.src.main.java.entities.Patient;


@Service
public interface PatientService{
	
	List<Patient> SelectPatient(Long IdP);

	PatientDTO save(PatientDTO patientDTO);

	Page<PatientDTO> findAll(Pageable pageable);

	/**
	 * Get one patient by id.
	 *
	 * @param id the id of the entity
	 * @return the entity
	 */
	PatientDTO findOne(Long id);

	List<PatientDTO> findAll();
	
}
