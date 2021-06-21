package cgm.src.main.java.mapper;

import cgm.src.main.java.entities.*;
import cgm.src.main.java.dto.*;
import org.mapstruct.Mapper;
/**
 * Mapper for the entity Patient and its DTO PatientDTO.
 */

@Mapper
public interface VisitMapper extends EntityMapper <VisitDTO, Visit> {
	
    default Visit fromId(Long id) {
        if (id == null) {
            return null;
        }
        Visit visit = new Visit();
        visit.setId(id);
        return visit;
    }
}