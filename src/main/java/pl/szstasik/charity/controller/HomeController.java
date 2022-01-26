package pl.szstasik.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.szstasik.charity.model.User;
import pl.szstasik.charity.service.HomeService;
import pl.szstasik.charity.service.UserService;

import javax.validation.Valid;


@Controller
public class HomeController {

    private HomeService homeService;
    private UserService userService;

    public HomeController(HomeService homeService, UserService userService) {
        this.homeService = homeService;
        this.userService = userService;
    }

    @RequestMapping("/")
    public String homeAction(Model model) {
        model.addAttribute("allBags", homeService.bagsSum());
        model.addAttribute("dontationsSum", homeService.dontationsSum());
        model.addAttribute("institutions", homeService.institutions());
        return "index";
    }

    @GetMapping("/register")
    public String saveUser(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String afterRegister(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/login")
    private String login() {
        return "/login";
    }

    @GetMapping("/logout")
    private String logout() {
        return "redirect:/";
    }
}
