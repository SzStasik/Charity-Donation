package pl.szstasik.charity.service;

import org.springframework.stereotype.Service;
import pl.szstasik.charity.model.Donation;
import pl.szstasik.charity.model.Institution;
import pl.szstasik.charity.repository.DonationRepository;
import pl.szstasik.charity.repository.InstitutionRepository;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService{

    private DonationRepository donationRepository;
    private InstitutionRepository institutionRepository;


    public HomeServiceImpl(DonationRepository donationRepository, InstitutionRepository institutionRepository) {
        this.donationRepository = donationRepository;
        this.institutionRepository = institutionRepository;
    }

    @Override
    public int bagsSum() {
        List<Donation> allDonations = donationRepository.findAll();
        int allBags = 0;
        for (Donation donation : allDonations) {
            allBags += donation.getQuantity();
        }
        return allBags;
    }

    @Override
    public int dontationsSum() {
        return donationRepository.findAll().size();
    }

    @Override
    public List<Institution> institutions() {
        return institutionRepository.findAll();
    }
}
