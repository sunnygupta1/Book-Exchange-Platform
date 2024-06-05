package com.project.bookexchange.service;

import com.project.bookexchange.model.ExchangeRequest;
import com.project.bookexchange.repository.ExchangeRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ExchangeRequestService {
   @Autowired
   private ExchangeRequestRepository exchangeRequestRepository;
   public ExchangeRequest save(ExchangeRequest request) {
       return exchangeRequestRepository.save(request);
   }
   public Optional<ExchangeRequest> findById(Long id) {
       return exchangeRequestRepository.findById(id);
   }
   public List<ExchangeRequest> findAll() {
       return exchangeRequestRepository.findAll();
   }
   public List<ExchangeRequest> findByRequester(Long requesterId) {
       return exchangeRequestRepository.findByRequesterId(requesterId);
   }
   public List<ExchangeRequest> findByOwner(Long ownerId) {
       return exchangeRequestRepository.findByOwnerId(ownerId);
   }
   public void deleteById(Long id) {
       exchangeRequestRepository.deleteById(id);
   }
}
