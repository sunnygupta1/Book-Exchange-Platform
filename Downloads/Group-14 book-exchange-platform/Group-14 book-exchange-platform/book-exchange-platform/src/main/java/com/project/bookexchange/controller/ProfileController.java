package com.project.bookexchange.controller;

import com.project.bookexchange.model.Profile;
import com.project.bookexchange.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/profiles")
public class ProfileController {
   @Autowired
   private ProfileService profileService;
   @PostMapping
   public ResponseEntity<Profile> createProfile(@RequestBody Profile profile) {
       Profile savedProfile = profileService.save(profile);
       return ResponseEntity.ok(savedProfile);
   }
   @GetMapping("/{id}")
   public ResponseEntity<Profile> getProfileById(@PathVariable Long id) {
       Optional<Profile> profile = profileService.findById(id);
       return profile.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
   }
   @GetMapping
   public List<Profile> getAllProfiles() {
       return profileService.findAll();
   }
//   @GetMapping("/user/{userId}")
//   public ResponseEntity<Profile> getProfileByUserId(@PathVariable Long userId) {
//       Optional<Profile> profile = profileService.findByUserId(userId);
//       return profile.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//   }
   @DeleteMapping("/{id}")
   public ResponseEntity<Void> deleteProfileById(@PathVariable Long id) {
       profileService.deleteById(id);
       return ResponseEntity.noContent().build();
   }
}
