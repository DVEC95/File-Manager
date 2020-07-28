package com.codeclan.example.FileManager.repositories;

import com.codeclan.example.FileManager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
