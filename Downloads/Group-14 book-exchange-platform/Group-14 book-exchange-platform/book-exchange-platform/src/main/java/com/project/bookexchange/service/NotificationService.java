package com.project.bookexchange.service;

import com.project.bookexchange.model.*;
import com.project.bookexchange.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class NotificationService {
   @Autowired
   private NotificationRepository notificationRepository;
   public Notification save(Notification notification) {
       return notificationRepository.save(notification);
   }
   public Optional<Notification> findById(Long id) {
       return notificationRepository.findById(id);
   }
   public List<Notification> findAll() {
       return notificationRepository.findAll();
   }
   public List<Notification> findByUser(Long userId) {
       return notificationRepository.findByUserId(userId);
   }
   public void deleteById(Long id) {
       notificationRepository.deleteById(id);
   }
}
