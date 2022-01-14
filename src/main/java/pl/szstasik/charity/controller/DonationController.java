package pl.szstasik.charity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.szstasik.charity.model.Donation;
import pl.szstasik.charity.service.CategoryService;
import pl.szstasik.charity.service.DonationService;
import pl.szstasik.charity.service.InstitutionService;

import javax.validation.Valid;

@Controller
@RequestMapping("donation")
public class DonationController {

    private DonationService donationService;
    private CategoryService categoryService;
    private InstitutionService institutionService;

    public DonationController(DonationService donationService, CategoryService categoryService, InstitutionService institutionService) {
        this.donationService = donationService;
        this.categoryService = categoryService;
        this.institutionService = institutionService;
    }

    @GetMapping("/add")
    public String addDonation(Model model) {
        model.addAttribute("donation", new Donation());
        model.addAttribute("categories", categoryService.listCategories());
        model.addAttribute("institutions", institutionService.listInstitutions());
        return "form";
    }

    @PostMapping("/add")
    public String donate(@Valid @ModelAttribute("donation") Donation donation, BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
        donationService.addDonation(donation);
        return "form-confirmation";
    }
}
