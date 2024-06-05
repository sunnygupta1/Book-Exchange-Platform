package com.project.bookexchange.controller;

import com.project.bookexchange.model.User;
import com.project.bookexchange.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/users")
public class UserController {
   @Autowired
   private UserService userService;
   @PostMapping
   public ResponseEntity<User> createUser(@RequestBody User user) {
       User savedUser = userService.save(user);
       return ResponseEntity.ok(savedUser);
   }
   @GetMapping("/{id}")
   public ResponseEntity<User> getUserById(@PathVariable Long id) {
       Optional<User> user = userService.findById(id);
       return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
   }
   @GetMapping
   public List<User> getAllUsers() {
       return userService.findAll();
   }
   @DeleteMapping("/{id}")
   public ResponseEntity<Void> deleteUserById(@PathVariable Long id) {
       userService.deleteById(id);
       return ResponseEntity.noContent().build();
   }
}
