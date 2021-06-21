package cgm.src.main.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cgm.src.main.java.entities.Visit;

public interface VisitRepository extends JpaRepository<Visit, Long> {

}
