package cgm.src.main.java.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cgm.src.main.java.dto.PatientDTO;
import cgm.src.main.java.dto.VisitDTO;
import cgm.src.main.java.entities.Patient;
import cgm.src.main.java.entities.Visit;
import cgm.src.main.java.mapper.PatientMapper;
import cgm.src.main.java.repository.PatientRepository;
import cgm.src.main.java.service.PatientService;

@Service("patient")
public class ManagePatientServiceImpl implements PatientService {
	
	private final Logger log = LoggerFactory.getLogger(ManagePatientServiceImpl.class);

    private final PatientRepository patientRepository;

    private final PatientMapper patientMapper;

    public ManagePatientServiceImpl(PatientRepository patientRepository, PatientMapper patientMapper) {
    	
    	this.patientMapper =  patientMapper;
    	this.patientRepository =  patientRepository;
    }

    @Override
    public PatientDTO save(PatientDTO patientDTO) {
        log.debug("Request to save a patient : {}", patientDTO);
        Patient patient = patientMapper.toEntity(patientDTO);
        patient = patientRepository.save(patient);
        PatientDTO result = patientMapper.toDto(patient);
        return result;
    }
    
    
	@Override
	public List<Patient> SelectPatient(Long IdP) {
		List<Patient> pateints = patientRepository.findById(IdP);
		return pateints;
	}
	

   
	@Override
    @Transactional(readOnly = true)
    public Page<PatientDTO> findAll(Pageable pageable) {
        log.debug("Request to get all patients");
        return patientRepository.findAll(pageable)
                .map(patientMapper::toDto);
    }

    /**
     * Get one patient by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    
	@Override
    @Transactional(readOnly = true)
    public PatientDTO findOne(Long id) {
        log.debug("Request to get Patient : {}", id);
        Patient vehiculeAssure = patientRepository.findOne(id);
        return patientMapper.toDto(vehiculeAssure);
    }

	   @Override
	    @Transactional(readOnly = true)
	    public List<PatientDTO> findAll() {
	        log.debug("Request to get all Patients");
	        List<Patient> listPatient = patientRepository.findAll();
	        List<PatientDTO> patientDTO = patientMapper.toDto(listPatient);
	          return patientDTO;   
	    }
	
}
