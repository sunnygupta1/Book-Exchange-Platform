package com.project.bookexchange.service;

import com.project.bookexchange.model.*;
import com.project.bookexchange.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class UserService {
   @Autowired
   private UserRepository userRepository;
   public User save(User user) {
       return userRepository.save(user);
   }
   public User findByUsername(String username) {
       return userRepository.findByUsername(username);
   }
   public Optional<User> findById(Long id) {
       return userRepository.findById(id);
   }
   public List<User> findAll() {
       return userRepository.findAll();
   }
   public void deleteById(Long id) {
       userRepository.deleteById(id);
   }
}













//import com.project.bookexchange.model.*;
//import com.project.bookexchange.repository.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import java.util.List;
//import java.util.Optional;
//@Service
//public class UserService {
//   @Autowired
//   private UserRepository userRepository;
//   @Autowired
//   private PasswordEncoder passwordEncoder;
//   public User save(User user) {
//       user.setPassword(passwordEncoder.encode(user.getPassword()));
//       return userRepository.save(user);
//   }
//   public User findByUsername(String username) {
//       return userRepository.findByUsername(username);
//   }
//   public Optional<User> findById(Long id) {
//       return userRepository.findById(id);
//   }
//   public List<User> findAll() {
//       return userRepository.findAll();
//   }
//   public void deleteById(Long id) {
//       userRepository.deleteById(id);
//   }
//}
