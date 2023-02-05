package com.example.demo.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Document;

@Repository
public interface DocumentRepository extends JpaRepository <Document, Long> {

}
