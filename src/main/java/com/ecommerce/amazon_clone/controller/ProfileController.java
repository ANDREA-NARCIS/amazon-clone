package com.ecommerce.amazon_clone.controller;

import com.ecommerce.amazon_clone.model.User;
import com.ecommerce.amazon_clone.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    private final UserRepository userRepository;

    public ProfileController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // View Profile
    @GetMapping
    public String profilePage(Model model, Principal principal) {

        if (principal == null) {
            return "redirect:/login";
        }

        User user = userRepository.findByUsername(principal.getName())
                .orElse(new User());

        model.addAttribute("user", user);
        return "profile";
    }

    // Update Profile
    @PostMapping("/update")
    public String updateProfile(@ModelAttribute User updatedUser, Principal principal) {

        if (principal == null) {
            return "redirect:/login";
        }

        User user = userRepository.findByUsername(principal.getName())
                .orElse(null);

        if (user != null) {
            user.setUsername(updatedUser.getUsername());
            userRepository.save(user);
        }

        // 🔥 KEY FIX: force session refresh
        return "redirect:/logout";
    }
}