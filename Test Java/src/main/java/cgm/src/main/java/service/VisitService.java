package cgm.src.main.java.service;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import cgm.src.main.java.dto.VisitDTO;

@Service
public interface VisitService {
	VisitDTO ConsultVisit( Long IdV);
	VisitDTO save(VisitDTO visitDTO);
	/**
	 * Get all the visits.
	 *
	 * @param pageable the pagination information
	 * @return the list of entities
	 */
	Page<VisitDTO> findAll(Pageable pageable);
	List<VisitDTO> findAll();
}
