package com.appdev.phishers.campilanang4.Controller;

import org.springframework.web.bind.annotation.*;
import com.appdev.phishers.campilanang4.Entity.ProfileSettingsEntity;
import com.appdev.phishers.campilanang4.Service.ProfileSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/profilesettings")

public class ProfileSettingsController {

    @Autowired
    private ProfileSettingsService profileSettingsService;

    @PostMapping("/add")
    public ProfileSettingsEntity creaProfileSettings(@RequestBody ProfileSettingsEntity profileSettings) {
        return profileSettingsService.createProfileSettings(profileSettings);
    }

    @GetMapping("/all")
    public List<ProfileSettingsEntity> getAllProfileSettings() {
        return profileSettingsService.getAllProfileSettings();
    }

    @GetMapping("/read/{id}")
    public ProfileSettingsEntity getProfileSettingsById(@PathVariable Long id) {
        return profileSettingsService.getProfileSettingsById(id);
    }

    @PutMapping("/update/{id}")
    public ProfileSettingsEntity updateProfileSettings(@PathVariable Long id, @RequestBody ProfileSettingsEntity profileSettings) {
        return profileSettingsService.updateProfileSettings(id, profileSettings);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProfileSettings(@PathVariable Long id) {
        return profileSettingsService.deleteProfileSettings(id);
    }
}
