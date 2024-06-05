package com.project.bookexchange.model;

import javax.persistence.*;
import java.util.Set;
@Entity
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String username;
   private String password;
   private String email;
   private String favoriteGenres;
   @OneToMany(mappedBy = "user")
   private Set<Book> books;
   // Getters and Setters
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFavoriteGenres() {
	return favoriteGenres;
}
public void setFavoriteGenres(String favoriteGenres) {
	this.favoriteGenres = favoriteGenres;
}
public Set<Book> getBooks() {
	return books;
}
public void setBooks(Set<Book> books) {
	this.books = books;
}
public User(Long id, String username, String password, String email, String favoriteGenres, Set<Book> books) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.email = email;
	this.favoriteGenres = favoriteGenres;
	this.books = books;
}
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
			+ ", favoriteGenres=" + favoriteGenres + ", books=" + books + "]";
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
   
}