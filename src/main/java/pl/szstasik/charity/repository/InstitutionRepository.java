package pl.szstasik.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szstasik.charity.model.Institution;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {
}
