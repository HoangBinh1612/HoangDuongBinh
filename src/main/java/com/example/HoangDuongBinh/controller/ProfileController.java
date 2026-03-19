package com.example.HoangDuongBinh.controller;

import com.example.HoangDuongBinh.model.Profile;
import com.example.HoangDuongBinh.service.ProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/profile")
    public String profile(Model model) {
        Profile profile = profileService.getProfile();
        model.addAttribute("profile", profile);
        return "profile";
    }

    @PostMapping("/profile/update")
    public String updateProfile(@ModelAttribute Profile profile) {
        profileService.updateProfile(profile);
        return "redirect:/profile";
    }

    @GetMapping("/api/profile")
    @ResponseBody
    public Profile getProfileApi() {
        return profileService.getProfile();
    }
}
