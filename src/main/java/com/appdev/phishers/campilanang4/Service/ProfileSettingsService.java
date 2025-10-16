package com.appdev.phishers.campilanang4.Service;

import org.springframework.stereotype.Service;
import com.appdev.phishers.campilanang4.Entity.ProfileSettingsEntity;
import com.appdev.phishers.campilanang4.Repository.ProfileSettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class ProfileSettingsService {

    @Autowired
    private ProfileSettingsRepository profileSettingsRepository;

    //create
    public List<ProfileSettingsEntity> getAllProfileSettings() {
        return profileSettingsRepository.findAll();
    }

    
    public ProfileSettingsEntity getProfileSettingsById(Long id) {    
        return profileSettingsRepository.findById(id).orElse(null);
    }

    public ProfileSettingsEntity createProfileSettings(ProfileSettingsEntity profileSettings) {
        profileSettings.setDateUpdated(java.time.LocalDate.now());
        return profileSettingsRepository.save(profileSettings);
    }

    public ProfileSettingsEntity updateProfileSettings(Long id, ProfileSettingsEntity profileSettingsDetails) {
        ProfileSettingsEntity profileSettings = profileSettingsRepository.findById(id).orElse(null);
        if (profileSettings != null) {
            profileSettings.setBio(profileSettingsDetails.getBio());
            profileSettings.setProfilePicture(profileSettingsDetails.getProfilePicture());
            return profileSettingsRepository.save(profileSettings);
        }
        return null;
    }

    public String deleteProfileSettings(Long id) {
        profileSettingsRepository.deleteById(id);
        return "Profile Settings with ID " + id + " deleted successfully!";
    }
}
