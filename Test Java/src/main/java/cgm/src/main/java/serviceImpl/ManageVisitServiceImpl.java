package cgm.src.main.java.serviceImpl;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cgm.src.main.java.dto.VisitDTO;
import cgm.src.main.java.entities.Visit;
import cgm.src.main.java.mapper.VisitMapper;
import cgm.src.main.java.repository.VisitRepository;
import cgm.src.main.java.service.VisitService;

@Service("visit")
public class ManageVisitServiceImpl implements VisitService {

	
	private final Logger log = LoggerFactory.getLogger(ManagePatientServiceImpl.class);

    private final VisitRepository visitRepository;

    private final VisitMapper visitMapper;

    public ManageVisitServiceImpl(VisitRepository visitRepository, VisitMapper visitMapper) {
    	
    	this.visitMapper =  visitMapper;
    	this.visitRepository =  visitRepository;
    }

    @Override
    public VisitDTO save(VisitDTO visitDTO) {
        log.debug("Request to save visit : {}", visitDTO);
        Visit visit = visitMapper.toEntity(visitDTO);
        visit = visitRepository.save(visit);
        VisitDTO result = visitMapper.toDto(visit);
        return result;
    }
    
    
    
	@Override
    @Transactional(readOnly = true)
    public Page<VisitDTO> findAll(Pageable pageable) {
        log.debug("Request to get all visits");
        return visitRepository.findAll(pageable)
                .map(visitMapper::toDto);
    }

   
    @Override
    @Transactional(readOnly = true)
    public VisitDTO ConsultVisit(Long id) {
        log.debug("Request to get visit : {}", id);
        Visit visit = visitRepository.findOne(id);
        return visitMapper.toDto(visit);
    }

    @Override
    @Transactional(readOnly = true)
    public List<VisitDTO> findAll() {
        log.debug("Request to get all vists");
        List<Visit> listVisit = visitRepository.findAll();
        List<VisitDTO> visitDTO = visitMapper.toDto(listVisit);
          return visitDTO;   
    }

  



	
}
