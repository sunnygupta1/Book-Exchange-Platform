package com.project.bookexchange.service;

import com.project.bookexchange.model.*;
import com.project.bookexchange.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class MessageService {
   @Autowired
   private MessageRepository messageRepository;
   public Message save(Message message) {
       return messageRepository.save(message);
   }
   public Optional<Message> findById(Long id) {
       return messageRepository.findById(id);
   }
   public List<Message> findAll() {
       return messageRepository.findAll();
   }
   public List<Message> findBySender(Long senderId) {
       return messageRepository.findBySenderId(senderId);
   }
   public List<Message> findByReceiver(Long receiverId) {
       return messageRepository.findByReceiverId(receiverId);
   }
   public void deleteById(Long id) {
       messageRepository.deleteById(id);
   }
}
