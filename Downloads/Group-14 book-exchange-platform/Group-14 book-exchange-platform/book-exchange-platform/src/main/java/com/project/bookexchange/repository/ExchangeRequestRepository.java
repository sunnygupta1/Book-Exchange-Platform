package com.project.bookexchange.repository;

import com.project.bookexchange.model.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
public interface ExchangeRequestRepository extends JpaRepository<ExchangeRequest, Long> {

	List<ExchangeRequest> findByRequesterId(Long requesterId);
	List<ExchangeRequest> findByOwnerId(Long OwnerId);
}
