package com.project.bookexchange.model;

import javax.persistence.*;
@Entity
public class Book {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String title;
   private String author;
   private String genre;
   private String condition;
   private String availabilityStatus;
   @ManyToOne
   @JoinColumn(name = "user_id")
   private User user;
   // Getters and Setters
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getCondition() {
	return condition;
}
public void setCondition(String condition) {
	this.condition = condition;
}
public String getAvailabilityStatus() {
	return availabilityStatus;
}
public void setAvailabilityStatus(String availabilityStatus) {
	this.availabilityStatus = availabilityStatus;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
@Override
public String toString() {
	return "Book [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + ", condition="
			+ condition + ", availabilityStatus=" + availabilityStatus + ", user=" + user + "]";
}
public Book(Long id, String title, String author, String genre, String condition, String availabilityStatus,
		User user) {
	super();
	this.id = id;
	this.title = title;
	this.author = author;
	this.genre = genre;
	this.condition = condition;
	this.availabilityStatus = availabilityStatus;
	this.user = user;
}
   
}
