package com.project.bookexchange.service;

import com.project.bookexchange.model.*;
import com.project.bookexchange.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class BookService {
   @Autowired
   private BookRepository bookRepository;
   public Book save(Book book) {
       return bookRepository.save(book);
   }
   public Optional<Book> findById(Long id) {
       return bookRepository.findById(id);
   }
   public List<Book> findAll() {
       return bookRepository.findAll();
   }
   public List<Book> findByUser(Long userId) {
       return bookRepository.findByUserId(userId);
   }
   public void deleteById(Long id) {
       bookRepository.deleteById(id);
   }
}
