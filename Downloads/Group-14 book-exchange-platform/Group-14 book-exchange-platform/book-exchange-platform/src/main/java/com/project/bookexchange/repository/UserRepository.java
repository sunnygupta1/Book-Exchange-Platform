package com.project.bookexchange.repository;

import com.project.bookexchange.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
   User findByUsername(String username);
}
