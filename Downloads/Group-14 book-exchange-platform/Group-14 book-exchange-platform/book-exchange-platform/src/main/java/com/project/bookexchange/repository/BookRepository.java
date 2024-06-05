package com.project.bookexchange.repository;

import com.project.bookexchange.model.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByUserId(Long userId);
}
