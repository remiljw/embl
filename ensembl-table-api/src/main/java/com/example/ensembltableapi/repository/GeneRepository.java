package com.example.ensembltableapi.repository;

import com.example.ensembltableapi.model.Gene;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// import java.util.List;

@Repository
public interface GeneRepository extends JpaRepository<Gene, Long> {
    
}