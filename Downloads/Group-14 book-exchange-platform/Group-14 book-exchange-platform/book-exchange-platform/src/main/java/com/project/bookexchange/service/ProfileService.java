package com.project.bookexchange.service;

import com.project.bookexchange.model.Profile;
import com.project.bookexchange.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ProfileService {
   @Autowired
   private ProfileRepository profileRepository;
   public Profile save(Profile profile) {
       return profileRepository.save(profile);
   }
   public Optional<Profile> findById(Long id) {
       return profileRepository.findById(id);
   }
   public List<Profile> findAll() {
       return profileRepository.findAll();
   }
   public void deleteById(Long id) {
       profileRepository.deleteById(id);
   }
}