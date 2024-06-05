package com.project.bookexchange.repository;

import com.project.bookexchange.model.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
public interface NotificationRepository extends JpaRepository<Notification, Long> {
	List<Notification> findByUserId(Long userId);
}
