package pl.szstasik.charity.service;

import org.springframework.stereotype.Service;
import pl.szstasik.charity.model.Donation;
import pl.szstasik.charity.repository.DonationRepository;

import java.util.Optional;
@Service
public class DonationServiceImpl implements DonationService {
    private DonationRepository donationRepository;

    public DonationServiceImpl(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    @Override
    public Donation addDonation(Donation donation) {
        return donationRepository.save(donation);
    }

    @Override
    public Optional<Donation> findDonationById(Long id) {
        return donationRepository.findById(id);
    }
}
