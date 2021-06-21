package cgm.src.main.java.rest;

import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cgm.src.main.java.service.PatientService;
import cgm.src.main.java.dto.PatientDTO;
import cgm.src.main.java.dto.VisitDTO;
import cgm.src.main.java.entities.Patient;


@Controller

public class PatientRest {
	  private final Logger log = LoggerFactory.getLogger(PatientRest.class);

	private PatientService patientService;
    private static final String ENTITY_NAME = "patient";

	 
	@Autowired
	public PatientRest(@Qualifier("patient") PatientService patientService) {
		super();
		this.patientService = patientService;
	}
	
	
	
    @PostMapping("/patients")
    
    public PatientDTO createPatient(@Valid @RequestBody PatientDTO patientDTO) throws URISyntaxException {
        log.debug("REST request to save ContratAssurance : {}", patientDTO);
        PatientDTO result = patientService.save(patientDTO);
        return result;
       
    }

  
    @PutMapping("/patients")
    
    public PatientDTO updateVisit(@Valid @RequestBody PatientDTO patientDTO) throws URISyntaxException {
        log.debug("REST request to update visit : {}", patientDTO);
        if (patientDTO.getId() == null) {
            return createPatient(patientDTO);
        }
       
        PatientDTO result = patientService.save(patientDTO);
       
        return result;
    }

    @GetMapping("/patients")
    
    public List<PatientDTO> getAllPatients() {
        log.debug("REST request to get a page of ContratAssurances");
        
       
        List<PatientDTO> page = patientService.findAll();
      
        return page;
        

    }
 

	@GetMapping(path="/selectpatient/{id}")
	public List<Patient> selectPatientForm(Long id) {		
		return patientService.SelectPatient(id);
	}
}
