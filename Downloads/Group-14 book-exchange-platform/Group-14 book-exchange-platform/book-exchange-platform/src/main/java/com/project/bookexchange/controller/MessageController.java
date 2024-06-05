package com.project.bookexchange.controller;

import com.project.bookexchange.model.Message;
import com.project.bookexchange.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/messages")
public class MessageController {
   @Autowired
   private MessageService messageService;
   @PostMapping
   public ResponseEntity<Message> createMessage(@RequestBody Message message) {
       Message savedMessage = messageService.save(message);
       return ResponseEntity.ok(savedMessage);
   }
   @GetMapping("/{id}")
   public ResponseEntity<Message> getMessageById(@PathVariable Long id) {
       Optional<Message> message = messageService.findById(id);
       return message.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
   }
   @GetMapping
   public List<Message> getAllMessages() {
       return messageService.findAll();
   }
   @GetMapping("/sender/{senderId}")
   public List<Message> getMessagesBySenderId(@PathVariable Long senderId) {
       return messageService.findBySender(senderId);
   }
   @GetMapping("/receiver/{receiverId}")
   public List<Message> getMessagesByReceiverId(@PathVariable Long receiverId) {
       return messageService.findByReceiver(receiverId);
   }
   @DeleteMapping("/{id}")
   public ResponseEntity<Void> deleteMessageById(@PathVariable Long id) {
       messageService.deleteById(id);
       return ResponseEntity.noContent().build();
   }
}