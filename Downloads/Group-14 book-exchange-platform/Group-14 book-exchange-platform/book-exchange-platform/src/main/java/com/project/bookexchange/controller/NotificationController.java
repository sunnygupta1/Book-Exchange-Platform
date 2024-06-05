package com.project.bookexchange.controller;

import com.project.bookexchange.model.Notification;
import com.project.bookexchange.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/notifications")
public class NotificationController {
   @Autowired
   private NotificationService notificationService;
   @PostMapping
   public ResponseEntity<Notification> createNotification(@RequestBody Notification notification) {
       Notification savedNotification = notificationService.save(notification);
       return ResponseEntity.ok(savedNotification);
   }
   @GetMapping("/{id}")
   public ResponseEntity<Notification> getNotificationById(@PathVariable Long id) {
       Optional<Notification> notification = notificationService.findById(id);
       return notification.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
   }
   @GetMapping
   public List<Notification> getAllNotifications() {
       return notificationService.findAll();
   }
   @GetMapping("/user/{userId}")
   public List<Notification> getNotificationsByUserId(@PathVariable Long userId) {
       return notificationService.findByUser(userId);
   }
   @DeleteMapping("/{id}")
   public ResponseEntity<Void> deleteNotificationById(@PathVariable Long id) {
       notificationService.deleteById(id);
       return ResponseEntity.noContent().build();
   }
}
