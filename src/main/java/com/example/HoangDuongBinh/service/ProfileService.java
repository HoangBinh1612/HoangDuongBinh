package com.example.HoangDuongBinh.service;

import com.example.HoangDuongBinh.model.Profile;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    private Profile profile;

    public ProfileService() {
        this.profile = createDefaultProfile();
    }

    public Profile getProfile() {
        return profile;
    }

    public Profile updateProfile(Profile updated) {
        profile.setName(updated.getName());
        profile.setEmail(updated.getEmail());
        profile.setPhone(updated.getPhone());
        profile.setBio(updated.getBio());
        profile.setLocation(updated.getLocation());
        profile.setOccupation(updated.getOccupation());
        profile.setGithub(updated.getGithub());
        profile.setTelegram(updated.getTelegram());
        profile.setExperience(updated.getExperience());
        profile.setEducation(updated.getEducation());
        if (updated.getAvatarUrl() != null && !updated.getAvatarUrl().isEmpty()) {
            profile.setAvatarUrl(updated.getAvatarUrl());
        }
        return profile;
    }

    private Profile createDefaultProfile() {
        Profile p = new Profile();
        p.setName("Ho\u00e0ng D\u01b0\u01a1ng B\u00ecnh");
        p.setEmail("duongbinh1612@gmail.com");
        p.setPhone("0989999999");
        p.setBio("Passionate software developer with 1 year of experience.");
        p.setLocation("Vietnam");
        p.setOccupation("Software Developer");
        p.setExperience("1 year");
        p.setEducation("University (2022 - 2026)");
        p.setGithub("https://github.com/HoangBinh1612");
        p.setTelegram("https://t.me/Anbatocoin");
        p.setAvatarUrl("");
        return p;
    }
}
