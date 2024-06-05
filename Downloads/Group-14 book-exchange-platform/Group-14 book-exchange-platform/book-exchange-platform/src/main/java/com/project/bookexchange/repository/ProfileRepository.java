package com.project.bookexchange.repository;

import com.project.bookexchange.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
