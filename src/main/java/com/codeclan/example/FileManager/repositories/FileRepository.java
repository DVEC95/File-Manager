package com.codeclan.example.FileManager.repositories;

import com.codeclan.example.FileManager.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
