package com.project.bookexchange.model;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Message {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @ManyToOne
   @JoinColumn(name = "sender_id")
   private User sender;
   @ManyToOne
   @JoinColumn(name = "receiver_id")
   private User receiver;
   private String messageContent;
   private LocalDateTime timestamp;
   // Getters and Setters
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public User getSender() {
	return sender;
}
public void setSender(User sender) {
	this.sender = sender;
}
public User getReceiver() {
	return receiver;
}
public void setReceiver(User receiver) {
	this.receiver = receiver;
}
public String getMessageContent() {
	return messageContent;
}
public void setMessageContent(String messageContent) {
	this.messageContent = messageContent;
}
public LocalDateTime getTimestamp() {
	return timestamp;
}
public void setTimestamp(LocalDateTime timestamp) {
	this.timestamp = timestamp;
}
public Message(Long id, User sender, User receiver, String messageContent, LocalDateTime timestamp) {
	super();
	this.id = id;
	this.sender = sender;
	this.receiver = receiver;
	this.messageContent = messageContent;
	this.timestamp = timestamp;
}
@Override
public String toString() {
	return "message [id=" + id + ", sender=" + sender + ", receiver=" + receiver + ", messageContent=" + messageContent
			+ ", timestamp=" + timestamp + "]";
}
   
}
