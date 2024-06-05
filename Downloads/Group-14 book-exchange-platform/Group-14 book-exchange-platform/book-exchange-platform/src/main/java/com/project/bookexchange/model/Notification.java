package com.project.bookexchange.model;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Notification {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @ManyToOne
   @JoinColumn(name = "user_id")
   private User user;
   private String notificationContent;
   private LocalDateTime timestamp;
   // Getters and Setters
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public String getNotificationContent() {
	return notificationContent;
}
public void setNotificationContent(String notificationContent) {
	this.notificationContent = notificationContent;
}
public LocalDateTime getTimestamp() {
	return timestamp;
}
public void setTimestamp(LocalDateTime timestamp) {
	this.timestamp = timestamp;
}
public Notification(Long id, User user, String notificationContent, LocalDateTime timestamp) {
	super();
	this.id = id;
	this.user = user;
	this.notificationContent = notificationContent;
	this.timestamp = timestamp;
}
@Override
public String toString() {
	return "notification [id=" + id + ", user=" + user + ", notificationContent=" + notificationContent + ", timestamp="
			+ timestamp + "]";
}
   
   
}
