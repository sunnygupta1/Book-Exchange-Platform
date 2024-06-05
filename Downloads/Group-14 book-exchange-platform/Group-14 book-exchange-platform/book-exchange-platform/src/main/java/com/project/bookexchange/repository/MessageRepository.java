package com.project.bookexchange.repository;

import com.project.bookexchange.model.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
public interface MessageRepository extends JpaRepository<Message, Long> {
	
	List<Message> findBySenderId(Long userId);
	List<Message> findByReceiverId(Long userId);
}
