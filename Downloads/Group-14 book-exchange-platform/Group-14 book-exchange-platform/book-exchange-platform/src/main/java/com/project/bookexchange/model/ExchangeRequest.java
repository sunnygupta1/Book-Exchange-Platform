package com.project.bookexchange.model;

import javax.persistence.*;
@Entity
public class ExchangeRequest {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @ManyToOne
   @JoinColumn(name = "requester_id")
   private User requester;
   @ManyToOne
   @JoinColumn(name = "owner_id")
   private User owner;
   @ManyToOne
   @JoinColumn(name = "book_id")
   private Book book;
   private String status;
   private String negotiationDetails;
   // Getters and Setters
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public User getRequester() {
	return requester;
}
public void setRequester(User requester) {
	this.requester = requester;
}
public User getOwner() {
	return owner;
}
public void setOwner(User owner) {
	this.owner = owner;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getNegotiationDetails() {
	return negotiationDetails;
}
public void setNegotiationDetails(String negotiationDetails) {
	this.negotiationDetails = negotiationDetails;
}
public ExchangeRequest(Long id, User requester, User owner, Book book, String status, String negotiationDetails) {
	super();
	this.id = id;
	this.requester = requester;
	this.owner = owner;
	this.book = book;
	this.status = status;
	this.negotiationDetails = negotiationDetails;
}
@Override
public String toString() {
	return "ExchangeRequest [id=" + id + ", requester=" + requester + ", owner=" + owner + ", book=" + book
			+ ", status=" + status + ", negotiationDetails=" + negotiationDetails + "]";
}
   
   
}
