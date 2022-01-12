package pl.szstasik.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szstasik.charity.model.Donation;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}
