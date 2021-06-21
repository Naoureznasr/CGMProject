package cgm.src.main.java.rest;
import java.net.URISyntaxException;
import java.util.List;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import cgm.src.main.java.dto.VisitDTO;
import cgm.src.main.java.service.VisitService;


@Controller
public class VisitRest {
	
	  private final Logger log = LoggerFactory.getLogger(VisitRest.class);


	    private static final String ENTITY_NAME = "visit";

	    private final VisitService visitService;

	    public VisitRest(VisitService visitService) {
	        this.visitService = visitService;
	    }

	  
	    @PostMapping("/visits")
	    
	    public VisitDTO createVisit(@Valid @RequestBody VisitDTO visitDTO) throws URISyntaxException {
	        log.debug("REST request to save ContratAssurance : {}", visitDTO);
	        	VisitDTO result = visitService.save(visitDTO);
	        return result;
	       
	    }

	  
	    @PutMapping("/visits")
	    
	    public VisitDTO updateVisit(@Valid @RequestBody VisitDTO visitDTO) throws URISyntaxException {
	        log.debug("REST request to update visit : {}", visitDTO);
	        if (visitDTO.getId() == null) {
	            return createVisit(visitDTO);
	        }
	        VisitDTO result = visitService.save(visitDTO);
	       
	        return result;
	    }
	
	    @GetMapping("/contrat-assurances")
	    
	    public List<VisitDTO> getAllContratAssurances() {
	        log.debug("REST request to get a page of ContratAssurances");
	        
	       
	        List<VisitDTO> page = visitService.findAll();
	      
	        return page;
	        

	    }
	    
	    @GetMapping("/visits/{id}")
	    public VisitDTO getOneVisit(@PathVariable Long id) {
	        log.debug("REST request to get Visit : {}", id);
	        VisitDTO visitDTO = visitService.ConsultVisit(id);
	        return visitDTO;
	    }

}
