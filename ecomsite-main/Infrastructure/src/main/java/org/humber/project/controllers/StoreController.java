package org.humber.project.controllers;

import java.util.List;

import org.humber.project.domain.User;
import org.humber.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StoreController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String index(Model model) {
        // Authentication authentication =
        // SecurityContextHolder.getContext().getAuthentication();
        // String username = authentication.getName();

        // Add the username to the model
        // model.addAttribute("username", username);
        return "store"; // This returns the name of the HTML file without the extension
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @GetMapping("/signin")
    public String loginPage(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/signin")
    public String postLogin(@ModelAttribute("user") User user) {
        // Perform your login logic here (authentication, etc.)
        // For simplicity, let's assume the login is successful

        // Redirect the user to the store page
        return "redirect:/";
    }

    @PostMapping("/process_register")
    public String postRegister(User user) {
        // TODO: process POST request
        userRepository.save(user);
        return "register_success";
    }

    @GetMapping("/userPage")
    public String adminPage(Model model) {
        return "adminpage";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String showLogoutPage(ModelMap model) {
        return "login";
    }

}
