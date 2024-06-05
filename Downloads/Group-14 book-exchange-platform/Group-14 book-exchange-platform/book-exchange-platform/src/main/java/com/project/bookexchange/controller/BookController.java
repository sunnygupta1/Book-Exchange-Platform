package com.project.bookexchange.controller;

import com.project.bookexchange.model.Book;
import com.project.bookexchange.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/books")
public class BookController {
   @Autowired
   private BookService bookService;
   @PostMapping
   public ResponseEntity<Book> createBook(@RequestBody Book book) {
       Book savedBook = bookService.save(book);
       return ResponseEntity.ok(savedBook);
   }
   @GetMapping("/{id}")
   public ResponseEntity<Book> getBookById(@PathVariable Long id) {
       Optional<Book> book = bookService.findById(id);
       return book.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
   }
   @GetMapping
   public List<Book> getAllBooks() {
       return bookService.findAll();
   }
   @GetMapping("/user/{userId}")
   public List<Book> getBooksByUserId(@PathVariable Long userId) {
       return bookService.findByUser(userId);
   }
   @DeleteMapping("/{id}")
   public ResponseEntity<Void> deleteBookById(@PathVariable Long id) {
       bookService.deleteById(id);
       return ResponseEntity.noContent().build();
   }
}
