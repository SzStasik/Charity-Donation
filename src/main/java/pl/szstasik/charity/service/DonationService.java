package pl.szstasik.charity.service;

import pl.szstasik.charity.model.Donation;

import java.util.Optional;

public interface DonationService {

    Donation addDonation(Donation donation);

    Optional<Donation> findDonationById(Long id);
}
