package com.project.bookexchange.model;

import javax.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Profile {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @OneToOne
   @JoinColumn(name = "user_id")
   private User user;
   private String readingPreferences;
   private String favoriteGenres;
   @OneToMany(mappedBy = "profile")
   private List<Book> booksOwned;
   // Getters and Setters


@Override
public String toString() {
	return "Profile [id=" + id + ", user=" + user + ", readingPreferences=" + readingPreferences + ", favoriteGenres="
			+ favoriteGenres + ", booksOwned=" + booksOwned + "]";
}
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
public String getReadingPreferences() {
	return readingPreferences;
}
public void setReadingPreferences(String readingPreferences) {
	this.readingPreferences = readingPreferences;
}
public String getFavoriteGenres() {
	return favoriteGenres;
}
public void setFavoriteGenres(String favoriteGenres) {
	this.favoriteGenres = favoriteGenres;
}
public List<Book> getBooksOwned() {
	return booksOwned;
}
public void setBooksOwned(List<Book> booksOwned) {
	this.booksOwned = booksOwned;
}
public Profile(Long id, User user, String readingPreferences, String favoriteGenres, List<Book> booksOwned) {
	super();
	this.id = id;
	this.user = user;
	this.readingPreferences = readingPreferences;
	this.favoriteGenres = favoriteGenres;
	this.booksOwned = booksOwned;
}


   
}
