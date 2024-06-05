package com.project.bookexchange.controller;

import com.project.bookexchange.model.ExchangeRequest;
import com.project.bookexchange.service.ExchangeRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/exchange-requests")
public class ExchangeRequestController {
   @Autowired
   private ExchangeRequestService exchangeRequestService;
   @PostMapping
   public ResponseEntity<ExchangeRequest> createExchangeRequest(@RequestBody ExchangeRequest exchangeRequest) {
       ExchangeRequest savedRequest = exchangeRequestService.save(exchangeRequest);
       return ResponseEntity.ok(savedRequest);
   }
   @GetMapping("/{id}")
   public ResponseEntity<ExchangeRequest> getExchangeRequestById(@PathVariable Long id) {
       Optional<ExchangeRequest> exchangeRequest = exchangeRequestService.findById(id);
       return exchangeRequest.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
   }
   @GetMapping
   public List<ExchangeRequest> getAllExchangeRequests() {
       return exchangeRequestService.findAll();
   }
   @GetMapping("/requester/{requesterId}")
   public List<ExchangeRequest> getExchangeRequestsByRequesterId(@PathVariable Long requesterId) {
       return exchangeRequestService.findByRequester(requesterId);
   }
   @GetMapping("/owner/{ownerId}")
   public List<ExchangeRequest> getExchangeRequestsByOwnerId(@PathVariable Long ownerId) {
       return exchangeRequestService.findByOwner(ownerId);
   }
   @DeleteMapping("/{id}")
   public ResponseEntity<Void> deleteExchangeRequestById(@PathVariable Long id) {
       exchangeRequestService.deleteById(id);
       return ResponseEntity.noContent().build();
   }
}
