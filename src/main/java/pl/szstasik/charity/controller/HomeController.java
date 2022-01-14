package pl.szstasik.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.szstasik.charity.service.HomeService;


@Controller
public class HomeController {

    private HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("allBags", homeService.bagsSum());
        model.addAttribute("dontationsSum", homeService.dontationsSum());
        model.addAttribute("institutions", homeService.institutions());
        return "index";
    }
}
