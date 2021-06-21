package cgm.src.main.java.mapper;

import cgm.src.main.java.entities.*;
import cgm.src.main.java.dto.*;
import org.mapstruct.Mapper;
/**
 * Mapper for the entity Patient and its DTO PatientDTO.
 */

@Mapper
public interface PatientMapper extends EntityMapper <PatientDTO, Patient> {
	
    default Patient fromId(Long id) {
        if (id == null) {
            return null;
        }
        Patient patient = new Patient();
        patient.setId(id);
        return patient;
    }
}
